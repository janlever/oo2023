package ee.jan.kontrolltoo2oige;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class OmanikController {
    @Autowired
    LemmikloomRepository lemmikloomRepository;
    @Autowired
    OmanikRepository omanikRepository;

    //localhost:8080/lisa-lemmikloom?id=1&nimetus=kass&kaal=7&omanikId=1&kogus=1
    @GetMapping("lisa-lemmikloom")
    public List<Lemmikloom> lisaLemmikloom (
            @RequestParam Long id,
            @RequestParam String nimetus,
            @RequestParam int kaal,
            @RequestParam Long omanikId,
            @RequestParam int kogus
    ) {
        Omanik omanik = omanikRepository.findById(omanikId).get();
        lemmikloomRepository.save(new Lemmikloom(id, nimetus, kaal, omanik, kogus));
        return lemmikloomRepository.findAll();
    }

    //localhost:8080/lisa-omanik?id=1&nimi=Joonas
    @GetMapping("lisa-omanik")
    public List<Omanik> lisaOmanik(
            @RequestParam Long id,
            @RequestParam String nimi
    ) {
        omanikRepository.save(new Omanik(id, nimi));
        return omanikRepository.findAll();

    }
    @GetMapping("loomade-arv")
    public int loomadeArv(
            @RequestParam Long omanikId) {
        Optional<Omanik> omanik = omanikRepository.findById(omanikId);
        return lemmikloomRepository.findByOmanik(omanik).size();
    }

//    @GetMapping("suurim-kaal")
//    public Lemmikloom SuurimKaal(
//            @RequestParam Long omanikId
//    ) {
//        Omanik omanik = omanikRepository.findById(omanikId).get();
//        List<Lemmikloom> lemmikloomad = omanik
//
//    }



}
