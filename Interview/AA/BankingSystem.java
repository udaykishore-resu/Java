public class BankingSystem implements BankingOperations{
    public static void main(String[] args) {
        BankingSystem obj = new BankingSystem();
        obj.createAccount(1, "101");
        obj.deposit(2, "101", 900);
        obj.pay(3, "101", 50);
        obj.printAccountBalance("101");
    }
}
