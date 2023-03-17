import java.io.*;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    static double summa = 0;
    static double kiirused = 0;
   
    static ArrayList<Double> keskmisedKiirused = new ArrayList<>();
    static ArrayList<Double> keskmisedKiirusedFailist = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        keskmine_kiirus(5, 10);
        keskmine_kiirus(14, 20);
        keskmine_kiirus(54, 68);

        Double kiirus1;
        Double kiirus2;

        System.out.println("Antud keskmised kiirused on: " + keskmisedKiirused.get(0) + "km/h, " + keskmisedKiirused.get(1) + "km/h ja " + keskmisedKiirused.get(2) + "km/h");
        kiirusedListis(keskmisedKiirused);

        BufferedReader br = new BufferedReader(new FileReader("kiirused2.txt"));
        String rida = br.readLine();
        while(rida != null) {

            System.out.println(rida);
            double number = Double.parseDouble(rida);
            for (double i = 0; i < number; i++) {
                keskmisedKiirusedFailist.add(number);
            }
            rida = br.readLine();
         }
        double kiirusedkokku = 0;
        for (int i = 0; i < keskmisedKiirusedFailist.size(); i++) {
            kiirusedkokku += keskmisedKiirusedFailist.get(i);
        }
        double kiirustekeskmine = kiirusedkokku / keskmisedKiirusedFailist.size();

        PrintWriter pw = new PrintWriter(new FileWriter("keskminekiirus.txt"));
        pw.println("Kõikide kiiruste keskmine on: " + kiirustekeskmine + "km/h");
        pw.close();
        }

//
//




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