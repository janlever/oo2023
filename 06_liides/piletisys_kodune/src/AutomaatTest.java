import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AutomaatTest {
    @Test
    public void kontrolli_kas_on_pensionari_soodukas_tootab() {
        Pensiokas vanamees = new Pensiokas("Pensionar", "14795", "18");
        assertEquals("Pesnionarina lõplik piletihind on: 12.6", vanamees.getSoodukas() );
    }

    @Test
    public void kontrolli_kas_pileti_ostmise_jarel_kontojaak_on_55_koma_5() {
        Opilane opilane = new Opilane("Õpilane", "78", "25");
        assertEquals("Su kontojääk on: 55.5", opilane.getKontojaak());
    }

    @Test
    public void kontrolli_kas_opilase_soodustuse_lisamisel_on_piletihind_15_koma_3() {
        Opilane opilane = new Opilane("Õpilane", "99","17");
        assertEquals("Õpilasena lõplik piletihind on: 15.3", opilane.getSoodukas());
    }
}
