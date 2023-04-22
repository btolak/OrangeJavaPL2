package pl.sda.OrangeJavaPL2.entity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;

import java.util.List;

@RestController
public class BreadController {
    BreadRepository repository;

    public BreadController(BreadRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/bread")
    public List<Bread> getBreads() {
        return repository.findAll();
    }
}
