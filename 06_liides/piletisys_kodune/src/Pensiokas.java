public class Pensiokas extends Pilet implements Arvutused{
    public Pensiokas(String eaklass, String vabaraha, String piletihind) {
        super(eaklass, vabaraha, piletihind);
    }

    @Override
    public String getSoodukas() {
        if (eaklass.startsWith("P")) {
            double lopphind = Integer.parseInt(piletihind) * 0.7;
            return "Pesnionarina lõplik piletihind on: " + lopphind;
        } else {
            return "-";
        }

    }

    @Override
    public String getKontojaak() {
        double lopphind = Integer.parseInt(piletihind) * 0.7;
        return "Su kontojääk on: " + (Integer.parseInt(vabaraha) - lopphind);

    }
}
