import java.util.Date;

public class rattarent {
    String eesnimi;
    String perenimi;
    String rattavalik;
    int telonr;
    long pangakonto;
    Date rentimisaeg;
    Date tagastamisaeg;

    public rattarent(String eesnimi, String perenimi, String rattavalik, int telonr, long pangakonto){
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.rattavalik = rattavalik;
        this.telonr = telonr;
        this.pangakonto = pangakonto;
        this.rentimisaeg  = new Date();
        this.tagastamisaeg = null;
    }
    public String renditud(){
        this.rentimisaeg = new Date();
        return "Ratas renditud!";
    }

    public void vahetaratas(String uusratas){
        this.rattavalik = uusratas;
        System.out.println("Rattavahetus oli edukas!");
    }
}
