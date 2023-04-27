package ee.jan.kodutoo9;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mangija {
    private int id;
    private String nimi;
    private int vorminr;
    private int pikkus;
    private boolean mangib;
}
