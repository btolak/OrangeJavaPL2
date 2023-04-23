package pl.sda.OrangeJavaPL2.exercise2.dataInitializer;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.OrangeJavaPL2.exercise2.entity.Art;
import pl.sda.OrangeJavaPL2.exercise2.repository.ArtRepository;

@Component
@RequiredArgsConstructor
public class ArtInitializer {
    private final ArtRepository artRepository;
   @PostConstruct
    public void initArt(){
       Art art=new Art("Dama z Łasiczką","da Vinci",50000000);
       Art art1=new Art("MonaLisa","da Vinci",30000000);
       artRepository.addArt(art);
       artRepository.addArt(art1);
   }
}
