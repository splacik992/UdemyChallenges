package TimBuchalka.section6.inheritanceExample;

public class Vehicle {

    private int doors;
    private int wheels;
    private String color;
    private String name;
    private int speed;

    public Vehicle(int doors, int wheels, String color, String name, int speed) {
        this.doors = doors;
        this.wheels = wheels;
        this.color = color;
        this.name = name;
        this.speed = speed;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
