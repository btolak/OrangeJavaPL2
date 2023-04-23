package pl.sda.OrangeJavaPL2.exercise2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "arts")
public class Art {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String author;
    double price;
    public Art(String name,String author,double price){

        this.name=name;
        this.author=author;
        this.price=price;
    }
}
