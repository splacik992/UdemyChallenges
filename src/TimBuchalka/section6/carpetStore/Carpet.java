package TimBuchalka.section6.carpetStore;

public class Carpet {

    private double cost;


    public Carpet() {
    }

    public Carpet(double cost) {
        if(cost<=0){
            cost=0;
        }
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
