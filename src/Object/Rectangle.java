package Object;

public class Rectangle {

    private int lenght;
    private int width;


    public int getField() {

        return lenght * width;
    }

    public int getCircuit() {
        return lenght * 2 + width * 2;
    }

    public int getDiagonal(){
        return lenght * lenght + width * width;
    }

    public Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5,4);
        System.out.println(rectangle.getCircuit() + "= obwód trójkąta");
        System.out.println(rectangle.getDiagonal() + "= przękątna trójkąta // jest źle, nie chciało się robić");
        System.out.println(rectangle.getField() + "= pole trojkata");

    }
}
