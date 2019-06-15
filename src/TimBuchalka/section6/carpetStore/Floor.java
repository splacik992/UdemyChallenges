package TimBuchalka.section6.carpetStore;

public class Floor {

    private double length;
    private double width;


    public Floor() {
    }

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        if (width <= 0) {
            return width = 0;
        }
        if (length <= 0) {
            return length = 0;
        }
        return this.width * this.length;
    }
}
