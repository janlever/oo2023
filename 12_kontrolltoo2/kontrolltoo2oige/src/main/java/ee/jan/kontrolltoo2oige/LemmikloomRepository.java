package ee.jan.kontrolltoo2oige;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LemmikloomRepository extends JpaRepository<Lemmikloom,Long> {
    List<Lemmikloom> findByOmanik(Optional<Omanik> omanik);
   
}
