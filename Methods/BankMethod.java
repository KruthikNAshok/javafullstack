class BankMethod {

    public static void main(String[] banking) {
        openAccount("Savings", "Kruthik");
        deposit("Savings", 10000);
        withdraw("Savings", 5000);
        checkBalance("Savings", 5000);
    }

    public static void openAccount(String accountType, String customerName) {
        System.out.println( accountType + customerName);
    }

    public static void deposit(String accountType, int amount) {
        System.out.println("Deposited ₹" + amount + " into " + accountType + " account");
    }

    public static void withdraw(String accountType, int amount) {
        System.out.println( amount +  accountType);
    }

    public static void checkBalance(String accountType, int balance) {
        System.out.println( accountType +  balance);
    }
}
