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

//
//{
//        "activity": "Start a blog for something you're passionate about",
//        "type": "recreational",
//        "participants": 1,
//        "price": 0.05,
//        "link": "",
//        "key": "8364626",
//        "accessibility": 0.1
//        }

@Service
@Slf4j
public class MyFirstConsumerService {
    @PostConstruct
    void callApi() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://www.boredapi.com/api/activity"))
                .build();

        HttpResponse httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        //JSON -> Java Object (POJO) (model class)
        ObjectMapper objectMapper = new ObjectMapper();

        MyFirstCosumerResponse response=objectMapper
                .readValue(httpResponse.body().toString(), MyFirstCosumerResponse.class);
        log.info(response.getActivity());
    }}
       /*
    *
    * {
    "activity": "Start a blog for something you're passionate about",
    "type": "recreational",
    "participants": 1,
    "price": 0.05,
    "link": "",
    "key": "8364626",
    "accessibility": 0.1
}
*
* -------------------> MyFirstConsumerResponse
    *
    *
    *
    *    *
    *
    * */

