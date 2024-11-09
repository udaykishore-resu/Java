public class BankAccount {
    private double balance;
    private String accountno;
    private String accounttype;

    public BankAccount(double balance, String accountno, String accounttype){
        this.balance = balance;
        this.accountno = accountno;
        this.accounttype = accounttype;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public void deposit(int amount){
        setBalance(getBalance()+amount);
    }

    public void withdrawl(int amount){
        setBalance(getBalance()-amount);
    }

    public double calculateInterest(){
        switch (this.accounttype) {
            case "Savings" -> {
                return this.balance * 0.03;
            }
            case "Checking" -> {
                return this.balance * 0.01;
            }
            case "FixedDeposit" -> {
                return this.balance * 0.05;
            }
            default -> {
            }
        }
                return balance;
    }
}
