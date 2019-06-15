package TimBuchalka.section6.poolArea;

public class Rectangle {
    private double width;
    private double lenght;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;

        if(width<0){
            setWidth(0);
        }
        if(lenght<0){
            setLenght(0);
        }
    }

    public double getArea(){
        return width*lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
}
