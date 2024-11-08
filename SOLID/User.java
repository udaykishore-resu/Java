import java.util.Date;

public class User{
    private final String firstname;
    private final String lastname;
    private final String email;
    private final SubscriptionTypes subscriptionTypes;
    private final Date subscriptionExpirationDate;

    public User(String firstname, String lastname, String email, SubscriptionTypes subscriptionTypes,  Date subscriptionExpirationDate){
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.subscriptionTypes = subscriptionTypes;
        this.subscriptionExpirationDate = subscriptionExpirationDate;
    }

    public String getName(){
        return getFirstname() +" "+getLastname();
    }

    public boolean hasExtraAccess(){
        Date dt = new Date();
        return subscriptionTypes == SubscriptionTypes.VIP && subscriptionExpirationDate.after(dt);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public SubscriptionTypes getSubscriptionTypes() {
        return subscriptionTypes;
    }

    public Date getSubscriptionExpirationDate() {
        return subscriptionExpirationDate;
    }
}

public enum SubscriptionTypes {STANDARD, VIP} 