package pl.sda.OrangeJavaPL2.entity;


import jakarta.persistence.*;
import lombok.*;

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
    @Column(name = "price_in_pln")
    private double price;
    public Bread(String name, Double price) {
        this.name = name;
        this.price = price;
    }


}
