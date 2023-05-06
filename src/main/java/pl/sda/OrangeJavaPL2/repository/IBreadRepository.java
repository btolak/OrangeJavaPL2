package pl.sda.OrangeJavaPL2.repository;


import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pl.sda.OrangeJavaPL2.entity.Bread;

import java.math.BigDecimal;

public interface IBreadRepository extends JpaRepository<Bread, Long> {

    Bread findByName(String name);

    @Query(value = "UPDATE Bread SET name = :name, price =:price WHERE id =:id")
    @Modifying
    @Transactional // all or nothing
    void updateBread(@Param("id") Long id,
                     @Param("name") String name,
                     @Param("price") BigDecimal price);
    // Select * from users where name = [AND 1=1, DROP users];  -> SQL injection

    //
//    @Query(value = "SELECT f FROM fruits f WHERE f.name = :name", nativeQuery = false)
//    List[Fruit] selectAllFruitsByProvidedName(@Param("name") String name);


}
