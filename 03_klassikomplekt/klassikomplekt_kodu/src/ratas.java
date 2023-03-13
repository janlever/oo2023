public class ratas {
    info info;
    double hind;

    public ratas(info info, double hind) {
        this.info = info;
        this.hind = hind;
    }

    public void salvestainfo(info info) {
        this.info = info;
    }

    public void suurendahinda(double lisahind) {
        this.hind = this.hind + lisahind;
    }

}
