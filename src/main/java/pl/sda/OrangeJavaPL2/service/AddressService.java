package pl.sda.OrangeJavaPL2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.OrangeJavaPL2.entity.Address;
import pl.sda.OrangeJavaPL2.repository.AddressRepository;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;

    public void addAddress(Address address) {
        addressRepository.addAddress(address);
    }

    public Set<Address> getAllAddresses() {
        return addressRepository.getAllAddresses();
    }
}
