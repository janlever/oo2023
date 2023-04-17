public class Main {
    public static void main(String[] args) {

        Koolieelik tatt = new Koolieelik("Koolieelik", "10", "7");
        System.out.println(tatt.getSoodukas());
        System.out.println(tatt.getKontojaak());

        Opilane opilane = new Opilane("Õpilane", "78", "25");
        System.out.println(opilane.getSoodukas());
        System.out.println(opilane.getKontojaak());

        Pensiokas vanamees = new Pensiokas("Pensionar", "14795", "18");
        System.out.println(vanamees.getSoodukas());
        System.out.println(vanamees.getKontojaak());
    }
}