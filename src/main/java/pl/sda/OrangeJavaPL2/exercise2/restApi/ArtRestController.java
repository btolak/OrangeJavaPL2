package pl.sda.OrangeJavaPL2.exercise2.restApi;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.OrangeJavaPL2.exercise2.entity.Art;
import pl.sda.OrangeJavaPL2.exercise2.repository.ArtRepository;
import pl.sda.OrangeJavaPL2.exercise2.service.ArtService;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ArtRestController {
private final ArtService artservice;
    @GetMapping("/arts")
    public List<Art> getAllArts(){return artservice.getAllArts();}
    @PostMapping(path ="/addArts")
    public void addArt(@RequestBody Art art) {
       artservice.addArt(art);
    }

}
