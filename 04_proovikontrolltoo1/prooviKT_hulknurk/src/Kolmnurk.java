import java.util.List;

public class Kolmnurk {
    List<Double> xCoords;
    List<Double> yCoords;

    public Kolmnurk(List<Double> xCoords, List<Double> yCoords) {
        this.xCoords = xCoords;
        this.yCoords = yCoords;
    }

    public double lisaJaAnnaymbermoot(double newX, double newY) {
        xCoords.add(newX);
        yCoords.add(newY);
//        Math.pow();
        return 2.0; //EI TEE

    }
}
