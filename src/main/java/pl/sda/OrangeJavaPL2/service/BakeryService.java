package pl.sda.OrangeJavaPL2.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.OrangeJavaPL2.entity.Bakery;
import pl.sda.OrangeJavaPL2.exceptions.BakeryNotFoundException;
import pl.sda.OrangeJavaPL2.repository.BakeryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class BakeryService {
    private static BakeryRepository bakeryRepository;

    public static void saveBakery(Bakery bakery) {
         bakeryRepository.saveBakery(bakery);

    }

    public List<Bakery> getAllBakeries() {

        return bakeryRepository.getAllBakeries();
    }

    public Bakery getBakeryById(Long id) {
        return (Bakery) bakeryRepository
                .getBakeryById(id)
                .orElseThrow(()->new BakeryNotFoundException("Bakery with this id does not exist"));
    }
}
