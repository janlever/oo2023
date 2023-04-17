public class Opilane extends Pilet implements Arvutused{
    public Opilane(String eaklass, String vabaraha, String piletihind) {
        super(eaklass, vabaraha, piletihind);
    }

    @Override
    public String getSoodukas() {
        if (eaklass.startsWith("Õ")) {
            double lopphind = Integer.parseInt(piletihind) * 0.9;
            return "Õpilasena lõplik piletihind on: " + lopphind;
        } else {
            return "-";
        }

    }

    @Override
    public String getKontojaak() {
        double lopphind = Integer.parseInt(piletihind) * 0.9;
        return "Su kontojääk on: " + (Integer.parseInt(vabaraha) - lopphind);

    }
}
