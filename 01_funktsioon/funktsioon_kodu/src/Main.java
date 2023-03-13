import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String hinnang = tulemushinnang(2);
        String hinnang2 = tulemushinnang(3);
        String hinnang3 = tulemushinnang(8);
        System.out.println(hinnang);
        System.out.println(hinnang2);
        System.out.println(hinnang3);

        nimekordus();

        teisendus();
    }

    private static void teisendus() {
        Scanner arv = new Scanner(System.in);
        System.out.println("Sisesta pikkus meetrites: ");
        double meetrid = arv.nextDouble();
        double jalad = meetrid * 3.28;
        System.out.println("Sinu pikkus jalgades on " + jalad + " jalga");
    }

    private static void nimekordus() {
        Scanner objekt = new Scanner(System.in); //loon scanner objekti
        System.out.println("Sisesta oma nimi");
        String nimeke = objekt.nextLine(); //loeb kasutaja sisestust
        System.out.println("Su nimi on " + nimeke); //väljastab kasutaja sisestuse
    }

    private static String tulemushinnang(double hupe) {
        if (hupe < 3){
            return "pead natuke pingutama";
        } else if (hupe <= 5) {
            return "oled keskmistega samas paadis";

        } else if (hupe <= 9 && hupe >= 6){
            return "tipptasemel vend täitsa";
        } else {
            return "sisesta tulemus ka ikka";
        }
    }
}