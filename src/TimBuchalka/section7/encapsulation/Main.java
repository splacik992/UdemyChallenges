package TimBuchalka.section7.encapsulation;

public class Main {



    public static void main(String[] args) {

        Printer printer = new Printer(50,true);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printedd was " + pagesPrinted + " new total print count for printer = " +
                printer.getPagesPrinted());

        printer.printPages(6);
        System.out.println("Pages printedd was " + pagesPrinted + " new total print count for printer = " +
                printer.getPagesPrinted());

    }


}