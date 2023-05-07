package pl.sda.OrangeJavaPL2.apiconsuming;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MyFirstCosumerResponse {
    private String activity;
    private String type;
    private Integer participants;
    private Double price;
    private String link;
    private String key;
    private Double accessibility;
}
