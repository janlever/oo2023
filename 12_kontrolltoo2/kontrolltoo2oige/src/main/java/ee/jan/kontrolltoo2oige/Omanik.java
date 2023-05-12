package ee.jan.kontrolltoo2oige;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Omanik {
    @Id
    private Long id;
    private String nimi;
//    @OneToMany
//    private List<Lemmikloom> lemmikloomad;
}
