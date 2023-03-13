import java.util.Date;
import java.util.Scanner;

public class info {
    String eesnimi;
    String perenimi;
    String rattavalik;
    int telonr;
    long pangakonto;
    Date rentimisaeg;
    Date tagastamisaeg;

    public info(String eesnimi, String perenimi, String rattavalik, int telonr, long pangakonto){
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.rattavalik = rattavalik;
        this.telonr = telonr;
        this.pangakonto = pangakonto;
        this.rentimisaeg  = new Date();
        this.tagastamisaeg = null;
    }

    public void vahetaratas(String uusratas){
        this.rattavalik = uusratas;
        System.out.println("Rattavahetus oli edukas");
    }

    public void kysirattatyyp(){
        Scanner objekt = new Scanner(System.in); //loon scanner objekti
        System.out.println("Sisesta oma uus valitud rattatüüp: ");
        String ratas = objekt.nextLine(); //loeb kasutaja sisestust
        System.out.println("Su uus ratas on:  " + ratas); //väljastab kasutaja sisestuse
    }
}
