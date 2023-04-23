package pl.sda.OrangeJavaPL2.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "breads")
@ToString
public class Bread {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(name = "price_in_pln")
    private double price;
    public Bread(String name, Double price) {
        this.name = name;
        this.price = price;
    }


}
