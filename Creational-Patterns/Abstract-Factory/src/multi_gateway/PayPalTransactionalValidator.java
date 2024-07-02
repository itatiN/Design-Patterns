package multi_gateway;

public class PayPalTransactionalValidator implements TransactionalValidator {
    public boolean validateTransaction(String transactionalId){
        System.out.println("Validating PayPal transaction: " + transactionalId);
        return true;
    }
}
