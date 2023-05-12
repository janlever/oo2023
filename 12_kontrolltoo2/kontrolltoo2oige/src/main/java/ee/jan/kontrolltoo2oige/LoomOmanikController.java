//package ee.jan.kontrolltoo2oige;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//public class LoomOmanikController {
//    @Autowired
//    LoomOmanikRepository loomOmanikRepository;
//
//   @GetMapping("max-kaal")
//    public int maxKaal(
//            @RequestParam Long id;
//   ) {
//       LoomOmanik loomOmanik = loomOmanikRepository.findById().get();
//       List<Lemmikloom> lemmikloomad = loomOmanik.getLemmikloomad();
//       int kaal = 0;
//       for (Lemmikloom t: lemmikloomad) {
//           if (kaal > 0){
//               kaal++;
//           }
//       }
//
//   }
//   return kaal;
//}
