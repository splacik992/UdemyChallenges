package TimBuchalka.section6.cylinder;

public class Cylinder extends Circle {

private double height;

    public Cylinder(double radius,double height) {
        super(radius);
        this.height = height;
        if(height<0){
            setHeight(0);
        }

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea() * height;
    }
}
