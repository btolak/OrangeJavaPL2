package pl.sda.OrangeJavaPL2.dataInitializer;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.OrangeJavaPL2.entity.*;
import pl.sda.OrangeJavaPL2.repository.AddressRepository;
import pl.sda.OrangeJavaPL2.repository.BakeryRepository;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;
import pl.sda.OrangeJavaPL2.service.AddressService;
import pl.sda.OrangeJavaPL2.service.BakeryService;
import pl.sda.OrangeJavaPL2.service.BreadService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer {
    private final BreadService breadService;
    private final AddressService addressService;
    private final BakeryService bakeryService;
    public void initData() {
        initAddresses();
        initBread();
        initBakeries();
    }



    @PostConstruct
    public void initAddresses() {
        Address address = new Address("Pilsudzkiego", "10", "10-100", "Polska");
        Address address1 = new Address("Mickiewicza", "12", "10-110", "Polska");

        addressService.addAddress(address);
        addressService.addAddress(address1);
    }

    //@PostConstruct // init -> open db connection
    //@PreDestron // -> close db connection
    public void initBread() {
        Bread bread = new Bread("Bagietka", BreadType.WHEAT, BigDecimal.valueOf(3.50));
        Bread bread1 = new Bread("Grahamka", BreadType.MULTIGRAIN, BigDecimal.valueOf(1.00));
        breadService.addBread(bread);
        breadService.addBread(bread1);
        // Single Responsibility Principal ->
        // RestController -exposing
        // Service ->business logic
        // Repository -> DAO/Access to DB
    }
    private void initBakeries() {
  //      List<Bread> breadList = new ArrayList<>();
        Bread bread = new Bread("Bagietka", BreadType.WHEAT, BigDecimal.valueOf(3.50));
        Bread bread1 = new Bread("Grahamka", BreadType.MULTIGRAIN, BigDecimal.valueOf(1.00));
//        breadList.add(bread);
//        breadList.add(bread1);

        Address address = new Address("Pilsudzkiego", "10", "10-100", "Polska");
        Address address1 = new Address("Mickiewicza", "12", "10-110", "Polska");

        Bakery bakery=new Bakery(
                Arrays.asList(bread,bread1),
                address,
                new Owner("John","Rambo",35));
        Bakery bakery1=new Bakery(
                Arrays.asList(bread,bread1),
                address1,
                new Owner("Jacki","Chan",53));

        BakeryService.saveBakery(bakery);
        //BakeryService.saveBakery(bakery1);

    }
}
