import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        keskmine_kiirus(5, 10);
        List<Double> keskmisedKiirused = new ArrayList<>();
        Double kiirus1 = null;
        Double kiirus2 = null;

        keskmisedKiirused.addAll(Arrays.asList(kiirus1, kiirus2));

        System.out.println("Keskmine kiirus on: " + keskmine_kiirus(5, 10) + "km/h");

    }

    private static double keskmine_kiirus(double kiirus1, double kiirus2) {
        return (kiirus1 + kiirus2) / 2;
//        List<Double> keskmisedKiirused = new ArrayList<>();
//        keskmisedKiirused.addAll(Arrays.asList(kiirus1, kiirus2));
//        System.out.println(keskmisedKiirused);

    }

    private static void kiirusedListis() {
        System.out.println(keskmisedKiirused);
    }


}