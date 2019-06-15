package TimBuchalka.section8.autoboxingExample;

import java.util.ArrayList;

public class Customer {
    private String name;
    public static ArrayList<Double> branch = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
