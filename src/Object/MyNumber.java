package Object;

public class MyNumber {


    private double a;
    private double x;

    public MyNumber(int a) {
        this.a = a;
    }

    boolean isODD() {
        if (a % 2 == 1) {
        }
        return true;
    }

    boolean isEven() {
        if (a % 2 == 0) {
        }
        return true;
    }

    public double sqrt() {
        return Math.sqrt(a);
    }

    public double pow() {
        return Math.pow(a, x);
    }

    public double add() {

        return a + x;
    }

    public int subtract() {
        return (int) (a-x);
    }

    MyNumber myNumber = new MyNumber(45643456);
}
