package pl.sda.OrangeJavaPL2.exercise.restApi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.OrangeJavaPL2.exercise.configuration.StartMessage;
import pl.sda.OrangeJavaPL2.exercise.entity.ClubFootball;
import pl.sda.OrangeJavaPL2.exercise.repository.ClubFootballRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class ClubFootballRestController{
    private final ClubFootballRepository clubFootballRepository;
    private final StartMessage startMessage;
    @GetMapping("/hi")
    public String hello(){return startMessage.getValue();}
    @GetMapping("/football")
    public List<ClubFootball> getAllClubFootball(){
        return clubFootballRepository.getAllClubFootball();
    }

}
