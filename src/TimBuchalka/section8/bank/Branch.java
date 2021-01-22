package TimBuchalka.section8.bank;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        if (!findCustomer(customerName)) {
            this.customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    private boolean findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return true;
            }
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                customer.addTransaction(transaction);
                return true;
            }
        }
        return false;
    }
}
