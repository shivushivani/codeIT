package CodeIT.Bank;

class Bank {
    public void displayInterestRate() {
        System.out.println("Interest rate is 5%");
    }
}

class BankA extends Bank {
    @Override
    public void displayInterestRate() {
        System.out.println("Interest rate of Bank A is 4%");
    }
}

class BankB extends Bank {
    @Override
    public void displayInterestRate() {
        System.out.println("Interest rate of Bank B is 6%");
    }
}

public class Banking {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        
        bank.displayInterestRate();  // Output: Interest rate is 5%
        bankA.displayInterestRate(); // Output: Interest rate of Bank A is 4%
        bankB.displayInterestRate(); // Output: Interest rate of Bank B is 6%
    }
}


