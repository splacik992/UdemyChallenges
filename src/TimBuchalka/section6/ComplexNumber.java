package TimBuchalka.section6;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber other) {
        add(other.real, other.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real = real - real;
        this.imaginary = imaginary - imaginary;
    }

    public void subtract(ComplexNumber other) {
        subtract(other.real, other.imaginary);
    }


    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
