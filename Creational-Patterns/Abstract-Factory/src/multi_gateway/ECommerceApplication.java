package multi_gateway;

public class ECommerceApplication {
    private PaymentProcessor paymentProcessor;
    private TransactionalValidator transactionalValidator;
    private FraudChecker fraudChecker;

    public ECommerceApplication(PaymentGatewayFactory factory){
        paymentProcessor = factory.createPaymentProcessor();
        transactionalValidator = factory.createTransactionalValidator();
        fraudChecker = factory.createFraudChecker();
    }

    public void processOrder(double amount, String transactionId) {
        if (transactionalValidator.validateTransaction(transactionId)) {
            if (!fraudChecker.checkFraud(transactionId)) {
                paymentProcessor.processPayment(amount);
                System.out.println("Payment processed successfully.");
            } else {
                System.out.println("Fraud detected. Payment rejected.");
            }
        } else {
            System.out.println("Transaction validation failed. Payment rejected.");
        }
    }
}
