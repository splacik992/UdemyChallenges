package TimBuchalka.section6.inheritanceExample;

public class Car extends Vehicle{

    private String handSteering;
    private int changingGears;
    private int speed;

    public Car( String color, String name, int speed, String handSteering, int changingGears) {
        super(4, 4, color, name,0);
        this.changingGears = changingGears;
        this.handSteering = handSteering;
        this.speed = speed;
    }



    @Override
    public String toString() {
        return "Car{" +
                "handSteering='" + handSteering + '\'' +
                ", changingGears=" + changingGears +
                ", speed=" + speed +
                '}';
    }

    public String getHandSteering() {
        return handSteering;
    }

    public void setHandSteering(String handSteering) {
        this.handSteering = handSteering;
    }

    public int getChangingGears() {
        return changingGears;
    }

    public void setChangingGears(int changingGears) {
        this.changingGears = changingGears;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
