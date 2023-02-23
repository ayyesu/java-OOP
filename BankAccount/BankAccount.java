public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(){}

    public BankAccount(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double deposit(double amount){
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount){
        if (amount > this.balance){
            System.out.println("Insufficient balance");
            return this.balance;
        }else{
            this.balance -= amount;
            return this.balance;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public static void main(String[] args){

        BankAccount account1 = new BankAccount("748295827", 2000.0);
        BankAccount account2 = new BankAccount("908654321", 500.0);

        // Deposit money into account1
        double newBalance1 = account1.deposit(500.0);
        System.out.println("New balance for account1: " + newBalance1);

        // Withdraw money from account2
        double newBalance2 = account2.withdraw(200.0);
        System.out.println("New balance for account2: " + newBalance2);

        // Attempt to withdraw more money from account1 than the current balance
        double newBalance3 = account1.withdraw(3000.0);
        System.out.println("New balance for account1: " + newBalance3);
    }
}
