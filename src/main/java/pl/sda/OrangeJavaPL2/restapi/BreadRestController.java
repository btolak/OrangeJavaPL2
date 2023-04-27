package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.OrangeJavaPL2.entity.Bread;

import pl.sda.OrangeJavaPL2.exceptions.BreadNotFoundException;
import pl.sda.OrangeJavaPL2.service.BreadService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/breads")
@RequiredArgsConstructor
@Slf4j
public class BreadRestController {
    //localhost:<port>/api/breads
    private final BreadService breadService;

    @GetMapping()
    public List<Bread> getAllBreads() {
        log.info("showing all breads");
        return breadService.getAllBreads();
    }

    //PostMapping without mapping error codes returning to client
//    @PostMapping()
//    void addBread(@RequestBody Bread bread) {
//        repository.addBread(bread);
//    }
    @PostMapping()
    ResponseEntity addBread(@RequestBody Bread bread) {
        log.info("added new bread ");return breadService.addBread(bread);
    }

    @DeleteMapping(path="{id}") // /api/breads/id
    public ResponseEntity deleteBreadById(@PathVariable Long id){
        log.info("Deleting bread with id: "+id);
        breadService.deleteBreadById(id);
                return ResponseEntity
                        .status(HttpStatus.NO_CONTENT)
                        .build();
    }
    @PutMapping(path="/{id}")
    public ResponseEntity updateBread(@PathVariable Long id, @RequestBody Bread bread){
        log.info("Updating bread with id :"+id);
        breadService.updateBread(id,bread.getName(),bread.getPrice());
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .build();
    }
    @GetMapping("/{id}")
    public Bread getBreadById(@PathVariable Long id){
        log.info("Get a bread with id : {id}");
        if(breadService.getBreadById(id).equals(null)){
            throw new BreadNotFoundException("Bread not found");
        }else{
        return breadService.getBreadById(id);
    }
}}
