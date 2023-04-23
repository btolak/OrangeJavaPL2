package pl.sda.OrangeJavaPL2.exercise2.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.sda.OrangeJavaPL2.exercise2.entity.Art;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ArtRepository {
    private final IArtRepository artRepository;

    public List<Art>  getAllArts(){return artRepository.findAll();}

    public void addArt(Art art){artRepository.save(art);}

}
