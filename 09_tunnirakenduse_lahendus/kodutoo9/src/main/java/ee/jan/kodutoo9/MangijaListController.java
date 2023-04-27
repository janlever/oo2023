package ee.jan.kodutoo9;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController

public class MangijaListController {
    List<Mangija> mangijad = new ArrayList<>(Arrays.asList(
            new Mangija(1, "Martin Müürsepp", 13, 206,false),
            new Mangija(2, "Kristo Saage", 33, 185,false),
            new Mangija(3, "Martin Dorbek", 22,193, true),
            new Mangija(4, "Siim-Sander Vene", 11, 203,true),
            new Mangija(5, "Asko Paade", 32, 204,false)
    ));
    @GetMapping("mangijad")
    public List<Mangija> saaMangijad() {
        return mangijad;
    }

    @DeleteMapping("kustuta-mangija/{index}")
    public List<Mangija> kustutaMangija(@PathVariable int index) {
        mangijad.remove(index);
        return mangijad;
    }

    @PostMapping("lisa-mangija")
    public List<Mangija> lisaMangijaURLParameetritega(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam int vorminr,
            @RequestParam int pikkus,
            @RequestParam boolean mangib) {
        mangijad.add(new Mangija(id, nimi, vorminr, pikkus, mangib));
        return mangijad;
    }

    @PatchMapping("pikkus-jalgadesse/{kordaja}")
    public List<Mangija> pikkusJalgadesse(@PathVariable int kordaja) {
        for (Mangija mangija : mangijad) {
            int vanaPikkus = mangija.getPikkus();
            int uusPikkus = vanaPikkus * kordaja;
            mangija.setPikkus(uusPikkus);
        }
        return mangijad;
    }

    @GetMapping("mangijanr-kogusummma")
    public int mangijanrKogusumma(@RequestBody List<Mangija> mangijad) {
        int sum = 0;
        for (Mangija mangija : mangijad) {
            sum = sum + mangija.getVorminr();
        }
        return sum;
    }
}
