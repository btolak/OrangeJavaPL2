package pl.sda.OrangeJavaPL2.exercise.dataInitializer;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.OrangeJavaPL2.exercise.entity.ClubFootball;
import pl.sda.OrangeJavaPL2.exercise.repository.ClubFootballRepository;

@Component
@RequiredArgsConstructor
public class ClubFootballInitializer {
    private final ClubFootballRepository clubFootballRepository;

    @PostConstruct
    public void initClubFootball() {
        ClubFootball clubFootball = new ClubFootball("Liverpool", 8, "Liverpool", "England");
        ClubFootball clubFootball1 = new ClubFootball("Legia", 2, "Warszawa", "Poland");
        clubFootballRepository.addClubFootball(clubFootball);
        clubFootballRepository.addClubFootball(clubFootball1);
    }
}
