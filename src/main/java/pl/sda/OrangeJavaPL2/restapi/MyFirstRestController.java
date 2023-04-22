package pl.sda.OrangeJavaPL2.restapi;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Profile("prd")
@RestController
public class MyFirstRestController {
    @Profile("prd")
    @GetMapping("/hello2")
    public String HelloProduction(){
        return "John Rambo from production";
    }
}
