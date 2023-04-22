package pl.sda.OrangeJavaPL2.exercise.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties("start")
public class StartMessage {
    private String value;
}
