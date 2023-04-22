package pl.sda.OrangeJavaPL2.restapi;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Profile("Dupa")
@RestController
public class MyFirstRestController {

    @GetMapping("/hello")
    public String HelloProduction(){
        return "John Rambo from production";
    }
}
