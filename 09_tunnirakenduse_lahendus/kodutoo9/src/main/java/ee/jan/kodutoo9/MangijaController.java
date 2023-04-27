package ee.jan.kodutoo9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MangijaController {
    Mangija mangija = new Mangija(1,"Martin Müürsepp", 13, 207,false);

    @GetMapping("mangija")
    public Mangija saaMangija() {
        return mangija;
    }

    @GetMapping("kustuta-mangija")
    public String kustutaMangija() {
        mangija = null;
        return "Edukalt kustutatud!";
    }

    @GetMapping("muuda-vorminr/{vorminr}")
    public Mangija muudaVorminr(@PathVariable int vorminr) {
        mangija.setVorminr(vorminr);
        return mangija;
    }

    @GetMapping("muuda-aktiivsust")
    public Mangija muudaAktiivsust() {
        if (mangija.isMangib() == true) {
            mangija.setMangib(false);
            return mangija;
        } else {
            if (mangija.isMangib() == false) {
                mangija.setMangib(true);
                return mangija;
            }
        }
        return mangija;
    }
    @GetMapping("muuda-nimi/{nimi}")
    public Mangija muudaNimi(@PathVariable String nimi) {
        mangija.setNimi(nimi);
        return mangija;
    }
}