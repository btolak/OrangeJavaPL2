package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;
import pl.sda.OrangeJavaPL2.repository.IBreadRepository;
import pl.sda.OrangeJavaPL2.service.BreadService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/breads")
@RequiredArgsConstructor
public class BreadRestController {
    //localhost:<port>/api/breads
    private final BreadService breadService;

    @GetMapping()
    public List<Bread> getAllBreads() {
        return breadService.getAllBreads();
    }

    //PostMapping without mapping error codes returning to client
//    @PostMapping()
//    void addBread(@RequestBody Bread bread) {
//        repository.addBread(bread);
//    }
    @PostMapping()
    ResponseEntity addBread(@RequestBody Bread bread) {
        return breadService.addBread(bread);
    }

    @DeleteMapping(path="{id}") // /api/breads/id
    public void deleteBreadById(@PathVariable Long id){
        breadService.deleteBreadById(id);
    }
    @PutMapping(path="/{id}")
    public void updateBread(@PathVariable Long id, @RequestBody Bread bread){
        breadService.updateBread(id,bread.getName(),bread.getPrice());
    }
}
