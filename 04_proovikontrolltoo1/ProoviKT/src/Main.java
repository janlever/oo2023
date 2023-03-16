import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //ESIMENE
        keskmine_jan();
        System.out.println("Keskmine on: " + keskmine_mihkel(5, 9, 4));

        //TEINE
        double[] sisend = {11, 12, 13, 14};
        System.out.println(Arrays.toString(libisevKeskmine(sisend)));

        //KOLMAS
        LibisevKeskmine libisev = new LibisevKeskmine(2, 3 ,4);
        libisev.lisaArv(4);
        System.out.println(libisev.arvudKeskmisega);
    }


    //ESIMENE
    private static void keskmine_jan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Sisesta esimene arv: ");
        int arv1 = input.nextInt();

        System.out.println("Sisesta teine arv: ");
        int arv2 = input.nextInt();

        System.out.println("Sisesta kolmas arv: ");
        int arv3 = input.nextInt();

        int keskmine = (arv1 + arv2 + arv3) / 3;
        System.out.println("Antud kolme arvu keskmine on " + keskmine);
    }

    private static double keskmine_mihkel(double arvYks, double arvKaks, double arvKolm) {
        return (arvYks + arvKaks + arvKolm) / 3;
    }


    //TEINE
    private static double[] libisevKeskmine(double[] arvud) {
        double[] valjund = new double[arvud.length - 2];//kui teen uue array pean koheselt ütlema kui pikk ta on
        for (int i = 0; i < arvud.length-2; i++) {
            valjund[i] = (arvud[i] + arvud[i+1] + arvud[i+2]) / 3;
        }
        return valjund;
    }
    //List numbriteList = new Arraylist(); <--- manipuleeritav
    //numbriteList[] <--- read-only
}