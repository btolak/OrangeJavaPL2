package pl.sda.OrangeJavaPL2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.sda.OrangeJavaPL2.entity.Bread;

public interface IBreadRepository extends JpaRepository<Bread,Long> {

  Bread findByName(String name);


  //
//    @Query(value = "SELECT f FROM fruits f WHERE f.name = :name", nativeQuery = false)
//    List[Fruit] selectAllFruitsByProvidedName(@Param("name") String name);


}
