package pl.sda.OrangeJavaPL2.dataInitializer;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;

@Component
@RequiredArgsConstructor
public class BreadInitializer {
    private final BreadRepository breadRepository;
    @PostConstruct
    public void initBread(){
        Bread bread =  new Bread(1L,"Bagietka",3.5);
        Bread bread1 =  new Bread(2L,"Poznańska",1);
    breadRepository.addBread(bread);
    breadRepository.addBread(bread1);
    }
}
