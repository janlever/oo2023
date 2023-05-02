package ee.jan.kodutookomplekt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Rent {
    private int id;
    private Klient rentija;
    private List<Ratas> rattad;
}
