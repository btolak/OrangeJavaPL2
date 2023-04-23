package pl.sda.OrangeJavaPL2.exercise2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.OrangeJavaPL2.exercise2.entity.Art;

public interface IArtRepository extends JpaRepository<Art,Long> {
}
