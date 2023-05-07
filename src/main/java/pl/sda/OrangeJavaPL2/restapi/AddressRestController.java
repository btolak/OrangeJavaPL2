package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.OrangeJavaPL2.entity.Address;
import pl.sda.OrangeJavaPL2.exceptions.AddressNotFoundException;
import pl.sda.OrangeJavaPL2.repository.AddressRepository;

import java.util.Set;

@RestController
@RequestMapping(path = "/api/addresses")
@RequiredArgsConstructor
@Slf4j
public class AddressRestController {

    private final AddressRepository addressRepository;

    @GetMapping
    public Set<Address> getAllAddresses(){
        return addressRepository.getAllAddresses();
    }
    @GetMapping("/{id}") //localhost:<port>/api/addresses/30 -> get addresses with id of 30
    public ResponseEntity getAddressById(@PathVariable Long id) {
        log.info("Get an address with id: {}", id);

        return ResponseEntity
                .status(200)
                .body(addressRepository.getAddressById(id)
                        .orElseThrow(()-> new AddressNotFoundException("Address with specified id does not exist")));
    }}
//        Optional<Address> address = addressRepository.getAddressById(id);
//        if (address.isPresent()) {
//            return ResponseEntity
//                    .status(HttpStatus.OK)
//                    .body(address.get());
//        } else {
//            log.info("Address with id {} not found", id);
//            throw new AddressNotFoundException("Address with specified id does not exist");
//        }

