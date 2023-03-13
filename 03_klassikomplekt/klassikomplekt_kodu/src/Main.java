public class Main {
    public static void main(String[] args) {

        info info = new info("Jaanus", "Saare", "BMX", 5151515, 454545454545L);
        ratas ratas = new ratas(info, 1000);

        ratas ratas2 = new ratas(new info("Joosep", "Kolgas", "suur", 5252525, 78787878787L),500);

        ratas.suurendahinda(250);

        info.vahetaratas("Fatbike");
        info.kysirattatyyp();
        System.out.println("Ratas 2 kuulub: " + ratas2.info.eesnimi);
    }
}