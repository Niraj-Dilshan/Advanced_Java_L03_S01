public class Customer {
    private double balance;
    private double wAmount;
    public synchronized void withdraw(double amount){
        System.out.println("Customer is going to withdraw from Account...");
        balance = Account.getBalance();
        wAmount = amount;
        if(balance < amount){
            System.out.println("Less balance in Account, waiting for deposit...");
            try{
                wait();
            }catch(Exception e){
                System.out.println("Something went wrong..."+ e.getMessage());
            }
        }
        balance = balance - amount;
        Account.setBalance(balance);
        System.out.println("Withdraw completed...");
    }

    synchronized void deposit(double amount){
        System.out.println("Customer is going to deposit money to Account...");
        balance = Account.getBalance();
        balance = balance + amount;
        Account.setBalance(balance);
        System.out.println("Deposit completed... ");
        if(balance > wAmount)
            notify();
        else
            System.out.println("Still less balance in Account, waiting for more deposit...");
    }
}
