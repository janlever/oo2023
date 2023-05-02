package ee.jan.kodutookomplekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class RentController {
    @Autowired
    KlientController klientController;
    @Autowired
    RatasController ratasController;

    List<Ratas> renditavadRattad = new ArrayList<>(Arrays.asList(
            new Ratas(4, "Fatbike", 30),
            new Ratas(5, "Lasteratas", 7.5)

    ));

    List<Ratas> renditavadRattad2 = new ArrayList<>(Arrays.asList(
            new Ratas(4, "Fatbike", 30),
            new Ratas(5, "Vichy", 7.5),
            new Ratas(6, "Pakiraamiga", 11.5)
    ));
    Klient rentija = new Klient(1, "Lagu",  "Noff", new Date());
    List<Rent> rendid = new ArrayList<>(Arrays.asList(
            new Rent(1, rentija, renditavadRattad),
            new Rent(2, rentija, renditavadRattad2)

    ));

    @GetMapping("rendid")
    public List<Rent> saaRendid() {
        return rendid;
    }

    @DeleteMapping("kustuta-rent/{index}")
    public String kustutaRendid(@PathVariable int index) {
        rendid.remove(index);
        return "Rent on kustutatud!";
    }

    @PostMapping("lisa-rent")
    public List<Rent> lisaRent(
            @RequestParam int id,
            @RequestParam int kliendiIndex,
            @RequestParam int rattaIndex) {
        Klient rentija = klientController.kliendid.get(kliendiIndex);

        Ratas renditudRatas = ratasController.rattad.get(rattaIndex);
        List<Ratas> renditudRattad = new ArrayList<>(Arrays.asList(renditudRatas));

        rendid.add(new Rent(id, rentija, renditudRattad));
        return rendid;
    }
}
