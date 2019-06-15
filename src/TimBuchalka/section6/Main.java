package TimBuchalka.section6;

import TimBuchalka.section6.bankAccount.BankAccount;
import TimBuchalka.section6.bankAccount.VipCustomer;
import TimBuchalka.section6.carpetStore.Calculator;
import TimBuchalka.section6.carpetStore.Carpet;
import TimBuchalka.section6.carpetStore.Floor;

public class Main {
    public static void main(String[] args) {

        //Bank account--------------------------------------------------------------------------------------
        System.out.println("----Bank Account----");
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100);
        bankAccount.getBalance();
        bankAccount.withdraw(50);
        bankAccount.deposit(70);

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());

        VipCustomer vipCustomer2 = new VipCustomer(50000.00, "Martin");
        System.out.println(vipCustomer2.getName());

        VipCustomer vipCustomer3 = new VipCustomer(34000.00, "Bob", "bob@email.com");
        System.out.println(vipCustomer3.getName() + " " + vipCustomer3.getEmail());
        System.out.println();

        //Wall-----------------------------------------------------------------------------------------------------
        System.out.println("----Wall----");
        Wall wall = new Wall(4,5);
        System.out.println("Wall area : ");
        wall.getArea();
        System.out.println();
        //Carpet Store---------------------------------------------------------------------------------------------
        System.out.println("----Carpet----");
        Carpet carpet = new Carpet(20.1);
        Floor floor = new Floor(10,7.5);

        Calculator calculator = new Calculator(floor,carpet);
        System.out.println("Total cost : " + calculator.getTotalCost());
        //Complex Number-------------------------------------------------------------------------------------------

        System.out.println("----Complex Number----");
        ComplexNumber one = new ComplexNumber(1,1);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());


    }
}
