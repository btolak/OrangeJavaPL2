package pl.sda.OrangeJavaPL2.exercise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClubFootball {
    @Id
    String name;
    int placeInLeague;
    String city;
    String country;
}
