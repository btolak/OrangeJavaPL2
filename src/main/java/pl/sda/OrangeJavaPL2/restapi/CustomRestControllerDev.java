package pl.sda.OrangeJavaPL2.restapi;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomRestControllerDev {




    @Profile("dev")
    @GetMapping("/hello")
    public String HelloDev(){
        return "John Rambo from dev";
    }



}
