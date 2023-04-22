package pl.sda.OrangeJavaPL2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.OrangeJavaPL2.entity.Bread;

@Repository
public interface BreadRepository extends JpaRepository<Bread,Long> {
    public Bread removeBreadById(long id);

}
