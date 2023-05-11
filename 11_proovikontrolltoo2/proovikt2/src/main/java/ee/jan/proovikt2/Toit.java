package ee.jan.proovikt2;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Toit {

    @Id
    private String nimetus;
    @ManyToMany
    private List<Toidukomponent> toidukomponendid;
}
