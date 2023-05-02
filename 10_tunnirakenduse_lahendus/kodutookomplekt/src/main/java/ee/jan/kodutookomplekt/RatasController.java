package ee.jan.kodutookomplekt;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController

public class RatasController {
    List<Ratas> rattad = new ArrayList<>(Arrays.asList(
            new Ratas(1, "BMX", 15),
            new Ratas(2, "Fatbike", 30),
            new Ratas(3, "Maantee", 10.7),
            new Ratas(4, "Lasteratas", 7.5),
            new Ratas(5, "Pakiraamiga", 11.5)
    ));

    @GetMapping("rattad")
    public List<Ratas> saaRattad() {
        return rattad;
    }

    @DeleteMapping("kustuta-ratas/{index}")
    public String kustutaRatas(@PathVariable int index) {
        rattad.remove(index);
        return "Ratas kustutatud!";
    }

    @PostMapping("lisa-ratas")
    public List<Ratas> lisaRatas(
            @RequestParam int id,
            @RequestParam String rattatyyp,
            @RequestParam double hind) {
        rattad.add(new Ratas(id, rattatyyp, hind));
        return rattad;
    }
}
