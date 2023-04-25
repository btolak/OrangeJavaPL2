package pl.sda.OrangeJavaPL2.entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity //Database entity-object to map
@Getter //required for entity
@Setter //required for entity
@NoArgsConstructor //required for entity
@AllArgsConstructor
@Table(name = "breads")  //change default name to custom one
@ToString
public class Bread {

    @Id //required for entity
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Autoincrement id with every single object
    private long id;
    private String name;
    @Enumerated(EnumType.STRING)
    BreadType breadType;
    @Column(name = "price_in_pln")
    BigDecimal price;

    public Bread(String name, BreadType breadType,BigDecimal price) {
        this.name = name;
        this.breadType = breadType;
        this.price = price;
    }

    public Bread(long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Bread(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
