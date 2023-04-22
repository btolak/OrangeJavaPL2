package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;

import java.util.List;

@RestController
@RequestMapping(path="/api")
@RequiredArgsConstructor
public class BreadRestController {
//localhost:<port>/api/breads
    private final BreadRepository repository;

    @GetMapping("/breads")
    public List<Bread> getAllBreads(){
        return repository.getAllBreads();
    }
}