package pl.sda.OrangeJavaPL2.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.sda.OrangeJavaPL2.entity.Address;
import pl.sda.OrangeJavaPL2.entity.Bread;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Repository
public class AddressRepository { //DAO - Data Access Object

    //dependency injection
    private final IAddressRepository addressRepository;

    public void addAddress(Address address){
        addressRepository.save(address);
    }

    public Set<Address> getAllAddresses(){
        return addressRepository.findAll()
                .stream()
                .collect(Collectors.toSet());
    }
    public Optional<Address> getAddressById(Long id) {
        return addressRepository.findById(id);
    }

}
