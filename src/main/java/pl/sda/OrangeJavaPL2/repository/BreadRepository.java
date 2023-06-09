package pl.sda.OrangeJavaPL2.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.sda.OrangeJavaPL2.entity.Bread;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class BreadRepository {

    private final IBreadRepository breadRepository;

    public List<Bread> getAllBreads(){
        return breadRepository.findAll();
    }

    public void addBread(Bread bread){
        breadRepository.save(bread);
    }

    public Bread getBreadByName(String name){
        return breadRepository.findByName(name);
    }

    public void deleteBreadById(Long id){breadRepository.deleteById(id);}

    public void updateBread(Long id, String name, BigDecimal price) {
        breadRepository.updateBread(id,name,price);

    }


    public Optional<Bread> getBreadById(Long id) {
        return breadRepository.findById(id);
    }
}
