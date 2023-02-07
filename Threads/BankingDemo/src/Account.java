public class Account {
    private static double balance = 0.0;

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        Account.balance = balance;
    }
}
