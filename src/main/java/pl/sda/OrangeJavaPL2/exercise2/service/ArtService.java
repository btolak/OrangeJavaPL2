package pl.sda.OrangeJavaPL2.exercise2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.sda.OrangeJavaPL2.exercise2.entity.Art;
import pl.sda.OrangeJavaPL2.exercise2.repository.ArtRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArtService {
    private final ArtRepository artRepository;

    public List<Art> getAllArts() {
        return artRepository.getAllArts();
    }

    public ResponseEntity addArt(Art art) {
        if (art == null) {
            return ResponseEntity
                    .status(404)
                    .build();
        } else if (art.getName().equals("Flaga")) {
            throw new IllegalArgumentException("To nie arcydzieło");
        } else {
            artRepository.addArt(art);
            return ResponseEntity
                    .status(201)
                    .build();
        }
    }
}
