package pl.sda.OrangeJavaPL2.exercise2.restApi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.OrangeJavaPL2.exercise2.entity.Art;
import pl.sda.OrangeJavaPL2.exercise2.repository.ArtRepository;

import java.util.List;

@RestController
@RequestMapping("/api/arts")
@RequiredArgsConstructor
public class ArtRestController {
private final ArtRepository artRepository;
    @GetMapping
    public List<Art> getAllArts(){return artRepository.getAllArts();}

}
