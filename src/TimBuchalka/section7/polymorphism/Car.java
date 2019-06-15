package TimBuchalka.section7.polymorphism;

public class Car {

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;


    public Car(int cylinders, String name) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }







    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6,"Outlander VRW");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

      Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }


}

 class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +" -> brake()";
    }
}

 class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() +" -> startEngine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +" -> brake()";
    }
}
