package TimBuchalka.section6.poolArea;

public class Cuboid extends Rectangle {

    public Cuboid(double width, double lenght, double height) {
        super(width, lenght);
        this.height = height;
        if(height<0){
            setHeight(0);
        }
    }

    private double height;

    public double gerVolume(){
        return height* getArea();
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
