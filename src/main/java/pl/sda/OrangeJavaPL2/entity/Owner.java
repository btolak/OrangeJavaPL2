package pl.sda.OrangeJavaPL2.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Owner {
    String firstName; // -> by default in db = first_name
    String lastName;
    int age;

}
