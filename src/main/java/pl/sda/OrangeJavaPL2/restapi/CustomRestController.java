package pl.sda.OrangeJavaPL2.restapi;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomRestController {

    @GetMapping("/hello")
    public String HelloDefault(){
        return "John Rambo";
    }


    @Profile("dev")
    @GetMapping("/hello1")
    public String HelloDev(){
        return "John Rambo from dev";
    }


    @Profile("prd")
    @GetMapping("/hello2")
    public String HelloProduction(){
        return "John Rambo from production";
    }
}
