import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
public class OttSubscription {
    private final SubscriptionTypes subscriptionTypes;
    
        public OttSubscription(SubscriptionTypes subscriptionTypes){
            this.subscriptionTypes = subscriptionTypes;
    }

    public SubscriptionTypes getSubscriptionTypes(){
        return subscriptionTypes;
    }
    
    public class AccessManager{
        public static boolean hasUnlimitedAccess(User user){
            Date dt = new Date();
            return user.getSubscriptionTypes() == SubscriptionTypes.VIP &&
            user.getSubscriptionExpirationDate().after(dt);
        }

        public static List<OttSubscription> getBasicContent(List<OttSubscription> ottbasic){
            return ottbasic.stream()
            .filter(ott -> ott.getSubscriptionTypes().equals(SubscriptionTypes.STANDARD))
            .collect(Collectors.toList());
        }

        public static List<OttSubscription> getPremiumContent(List<OttSubscription> ottprem){
            return ottprem.stream()
            .filter(ott -> SubscriptionTypes.VIP.equals(ott.getSubscriptionTypes()))
            .collect(Collectors.toList());
        }

        public static List<OttSubscription>  getSubbyUser(List<OttSubscription> otts, User user){
            if(user.getSubscriptionTypes().equals(SubscriptionTypes.VIP)) 
                return getPremiumContent(otts);
            else
                return  getBasicContent(otts);
        }
    }
}
