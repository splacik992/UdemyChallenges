package TimBuchalka.section6.bankAccount;

public class VipCustomer {

    private double creditLimit;
    private String name;
    private String email;


    public VipCustomer(){
        this(500000.00, "Default name" , "default@email.com" );
    }
    public VipCustomer(double creditLimit, String name) {
        this(creditLimit,name ,"Alala@alal.pl");
    }

    public VipCustomer(double creditLimit, String name, String email) {
        this.creditLimit = creditLimit;
        this.name = name;
        this.email = email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
