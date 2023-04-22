package pl.sda.OrangeJavaPL2.exercise.repository;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.sda.OrangeJavaPL2.exercise.configuration.StartMessage;
import pl.sda.OrangeJavaPL2.exercise.entity.ClubFootball;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ClubFootballRepository {
   private final IClubFootballRepository clubFootballRepository;


   public List<ClubFootball> getAllClubFootball(){return clubFootballRepository.findAll();}
    public void addClubFootball(ClubFootball clubFootball){clubFootballRepository.save(clubFootball);}
}
