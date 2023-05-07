package pl.sda.OrangeJavaPL2.apiconsuming;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
@Slf4j
public class MySecondConsumerService {
    @PostConstruct
    void callSecondApi() throws IOException, InterruptedException {
        HttpClient httpClient =HttpClient.newHttpClient();
        HttpRequest request  = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://official-joke-api.appspot.com/random_joke"))
                .build();

        HttpResponse httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper=new ObjectMapper();
        MySecondConsumerResponse response = objectMapper
                .readValue(httpResponse.body().toString(),MySecondConsumerResponse.class);
        log.info(response.getSetup()+"\n"+response.getPunchline());

    }
}
