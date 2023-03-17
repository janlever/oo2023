import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static double summa = 0;
    static ArrayList<Double> keskmisedKiirused = new ArrayList<>();

    public static void main(String[] args) {
        keskmine_kiirus(5, 10);
        keskmine_kiirus(14, 20);
        keskmine_kiirus(54, 68);

        Double kiirus1;
        Double kiirus2;

        System.out.println("Antud keskmised kiirused on: " + keskmisedKiirused.get(0) + "km/h, " + keskmisedKiirused.get(1) + "km/h ja " + keskmisedKiirused.get(2));
        kiirusedListis(keskmisedKiirused);

    }

    private static void keskmine_kiirus(double kiirus1, double kiirus2) {
        keskmisedKiirused.add((kiirus1 + kiirus2) / 2);
    }

    private static void kiirusedListis(ArrayList<Double> keskmisedKiirused) {
        for (int i = 0; i < keskmisedKiirused.size(); i++) {
           summa += keskmisedKiirused.get(i);
        }
        System.out.println("Kõikide kiiruste keskmine on: " + summa / keskmisedKiirused.size() + "km/h");
    }


}