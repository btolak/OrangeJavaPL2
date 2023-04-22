package pl.sda.OrangeJavaPL2.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomRestController {
    @GetMapping("/hello")
    public String helloDefualt(){return "John Rambo default";}
//    @RequestMapping(method = RequestMethod.GET,path = "/hellodef")
//    public String helloDev1(){
//        return "Hello default";
   // }
    //Powyższe metody są tożsame
    //above methods do the same job
}
