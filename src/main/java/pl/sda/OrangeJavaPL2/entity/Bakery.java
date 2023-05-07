package pl.sda.OrangeJavaPL2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Bakery {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToMany (cascade = CascadeType.ALL)
    List<Bread> breadList;
    @OneToOne (cascade = CascadeType.ALL)
    Address address;

    @OneToOne(cascade = CascadeType.ALL)
    Owner owner;

    public Bakery(List<Bread> breadList, Address address, Owner owner) {
        this.breadList = breadList;
        this.address = address;
        this.owner = owner;
    }
}
