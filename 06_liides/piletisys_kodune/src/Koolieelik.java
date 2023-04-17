public class Koolieelik extends Pilet implements Arvutused{
    public Koolieelik(String eaklass, String vabaraha, String piletihind) {
        super(eaklass, vabaraha, piletihind);
    }

    @Override
    public String getSoodukas() {
        if (eaklass.startsWith("K")) {
            double lopphind = 0;
            return "Koolieelikuna lõplik piletihind on: " + lopphind;
        } else {
            return "-";
        }

    }

    @Override
    public String getKontojaak() {
        double lopphind = 0;
        return "Su kontojääk on: " + (Integer.parseInt(vabaraha) - lopphind);

    }
}
