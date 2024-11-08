import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BankingOperations {
    Map<String, Integer> accounts = new HashMap<>();
    List<String> transactions = new ArrayList<>(); 

    default void addTransaction(int timestamp, String desc){
        transactions.add("timestamp:" +timestamp +"," +desc);
    }

    default boolean createAccount(int timestamp, String accountId){
        if(accounts.containsKey(accountId)){
            return false;
        } else{
            accounts.put(accountId,0);
            addTransaction(timestamp, "Account Created:" +accountId);
            return true;
        }
    }

    default Optional<Integer> deposit(int timestamp, String accountId, int amount){
        if(accounts.containsKey(accountId)){
            int balance = accounts.get(accountId) + amount;
            accounts.put(accountId, balance);
            addTransaction(timestamp, "Amount Deposited: "+amount+"to account: "+accountId);
            return Optional.of(balance);
        } else{
            return Optional.empty();
        }
    }

    default void pay(int timestamp, String accountId, int amount){
        if(accounts.containsKey(accountId)){
            if(accounts.get(accountId) > amount){
                accounts.put(accountId, accounts.get(accountId)-amount);
                addTransaction(timestamp, "payment of: "+amount +" made from account: "+accountId);
            } else{
                addTransaction(timestamp, "Insufficient fund in account: "+accountId);
            }
        } else{
            addTransaction(timestamp, "account: "+accountId +" not found");
        }
    }

    default void printAccountBalance(String accountId) {
        if (accounts.containsKey(accountId)) {
            System.out.println("Account " + accountId + " balance: " + accounts.get(accountId));
        } else {
            System.out.println("Account not found: " + accountId);
        }
    }

}
