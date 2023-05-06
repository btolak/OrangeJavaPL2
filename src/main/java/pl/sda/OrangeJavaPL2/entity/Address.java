package pl.sda.OrangeJavaPL2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @Transient //to not include this field in DB schema
    String number;
    String postalCode;
    String country;

    // all fields except id
    public Address(String name, String number, String postalCode, String country) {
        this.name = name;
        this.number = number;
        this.postalCode = postalCode;
        this.country = country;
    }
}
