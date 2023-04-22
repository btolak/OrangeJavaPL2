package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.OrangeJavaPL2.configuration.WelcomeMessage;

@RestController
@RequiredArgsConstructor
public class CustomRestController {
    private final WelcomeMessage welcomeMessage;
    @GetMapping("/hello")
    public String helloDefualt(){return "John Rambo default "+welcomeMessage.getValue();}
//    @RequestMapping(method = RequestMethod.GET,path = "/hellodef")
//    public String helloDev1(){
//        return "Hello default";
   // }
    //Powyższe metody są tożsame
    //above methods do the same job
}
