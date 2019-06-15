package TimBuchalka.BurgerShop;

public class Hamburger {

    private String bread;
    private double price;
    private String meat;
    private String addition;
    private String name;


    public Hamburger(String bread, double price, String meat, String addition, String name) {
        this.bread = bread;
        this.price = price;
        this.meat = meat;
        this.addition = addition;
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public double getPrice() {
        return price;
    }

    public String getMeat() {
        return meat;
    }

    public String getAddition() {
        return addition;
    }

    public String getName() {
        return name;
    }
}
