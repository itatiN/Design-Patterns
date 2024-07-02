package multi_gateway;

public class PayPalFraudChecker implements FraudChecker{
    public boolean checkFraud(String transactionId){
        System.out.println("Checking fraud for PayPal transaction: " + transactionId);
        return false;
    }
}
