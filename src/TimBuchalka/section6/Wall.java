package TimBuchalka.section6;

public class Wall {


    private double width;
    private double height;


    public Wall() {
    }

    public Wall(double width, double length) {
        this.width = width;
        this.height = length;

        if (width < 0) {
            this.width = 0;
        }
        if (length < 0) {
            this.height = 0;
        }
    }

    public void getArea(){
        double area = this.width * this.height;
        System.out.println("Area of the wall is : " + area);
    }



    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {
        if(this.width < 0){
            this.width = 0;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(this.height < 0){
            this.height = 0;
        }
        this.height = height;
    }
}
