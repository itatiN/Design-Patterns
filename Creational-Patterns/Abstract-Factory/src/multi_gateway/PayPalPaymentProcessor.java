package multi_gateway;

public class PayPalPaymentProcessor implements PaymentProcessor {
    public void processPayment(double amount){
        System.out.println("Validating PayPal transaction: " + amount);
    }    
}
