//Tee klass Lemmikloom (nimetus, kaal) ning
// võimalda teda andmebaasi lisada.
// Lisa klass Omanik, kes seo Lemmikloomaga üks-mitmele seose kaudu.
// Võimalda Omanikule juurde lisada lemmikloomi.
//* Võimalda küsida Lemmikloomade koguarvu ühe omaniku osas
// (sisendiks omanik ja väljundiks arv).
// Võimalda ühe omaniku kõige suurema kaaluga lemmiklooma
// leida ja kõige väiksema kaaluga.
// Võimalda sisestada minimaalne kaal ja maksimaalne kaal
// ning väljasta kõik lemmikloomad selles vahemikus.
//* Tee uus andmebaasitabel Kliinik
// , mis omab üks-mitmele seost lemmikloomaga.
// Võimalda kliinikust otsida kindlat lemmiklooma tema nimetuse järgi.
// Võimalda API otspunktist anda vaid üks kliinik - kellel on kõige rohkem
// lemmikloomi.

package ee.jan.kontrolltoo2oige;

import jakarta.persistence.*;
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
public class Lemmikloom {
    @Id
    private Long id;
    private String nimetus;
    private int kaal;
    @ManyToOne
    private Omanik omanik;
    private int kogus;

}
