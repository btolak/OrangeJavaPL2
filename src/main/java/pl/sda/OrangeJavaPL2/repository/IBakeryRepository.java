package pl.sda.OrangeJavaPL2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.OrangeJavaPL2.entity.Bakery;
import pl.sda.OrangeJavaPL2.service.BakeryService;

import java.util.List;
import java.util.Optional;

public interface IBakeryRepository extends JpaRepository<Bakery,Long> {


    Optional<Object> getBakeryById(Long id);

//    Bakery getBakeryById(Long id);

}
