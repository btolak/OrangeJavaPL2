package pl.sda.OrangeJavaPL2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Bakery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToMany (cascade = CascadeType.ALL)
    List<Bread> breadList;
    @OneToOne (cascade = CascadeType.ALL)
    Address address;

    @Embedded
    Owner owner;
}
