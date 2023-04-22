package pl.sda.OrangeJavaPL2.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.OrangeJavaPL2.exercise.entity.ClubFootball;

public interface IClubFootballRepository extends JpaRepository<ClubFootball,String> {

}
