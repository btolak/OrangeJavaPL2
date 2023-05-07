package pl.sda.OrangeJavaPL2.apiconsuming;

import lombok.*;

// {"type":"general","setup":"Well...","punchline":"That’s a deep subject.","id":65}
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MySecondConsumerResponse {
    private String type;
    private String setup;
    private String punchline;
    private Long id;
}
