package TimBuchalka.section8.bank;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public void addBranch(String branchName) {
        if (!(findBranch(branchName) == null)) {
            System.out.println("Branch is exist");
        } else {
            branches.add(new Branch(branchName));
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, initialTransaction);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            } else {
                System.out.println("Branch is not exist");
            }
        }
        return null;
    }
}
