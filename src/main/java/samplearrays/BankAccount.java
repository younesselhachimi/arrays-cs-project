package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    double[] transactions = new double[1000];
    int transaction_Count = 0;

    public BankAccount(String name, int startingBalance){
        this.name=name;
        this.currentBalance = startingBalance;
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("The amount must be positive.");
            return ;
        }
        currentBalance+=amount;
        transactions[transaction_Count] =amount;
        transaction_Count++;
        System.out.println(name + " diposit : " + amount + ". New balance : " + currentBalance);
    }

    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("The amount must be positive.");
            return ;
        }
        if(amount>currentBalance){
            System.out.println("unsuccessful withdraw. The amount is insufficient");
            return ;
        }
        currentBalance-=amount;
        transactions[transaction_Count]= (-amount);
        transaction_Count++;
        System.out.println("New balance after withdrawis  : " + currentBalance);

    }

    public void displayTransactions(){
        if (transaction_Count == 0) {
            System.out.println("No transactions .");
            return;
        }

        System.out.println("Your list of transactions is the following: ");
        for(int i=0; i<transaction_Count-1; i++) {
            System.out.print(transactions[i]);
            System.out.print(" | ");
        }
        System.out.println(transactions[transaction_Count-1]);
    }

    public void displayBalance(){
        System.out.println("The current balance of the account is : " + currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
