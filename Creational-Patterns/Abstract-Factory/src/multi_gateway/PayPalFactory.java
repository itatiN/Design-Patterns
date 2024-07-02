package multi_gateway;

class PayPalFactory implements PaymentGatewayFactory {
    public PaymentProcessor createPaymentProcessor(){
        return new PayPalPaymentProcessor();
    }

    public TransactionalValidator createTransactionalValidator(){
        return new PayPalTransactionalValidator();
    }

    public FraudChecker createFraudChecker(){
        return new PayPalFraudChecker();
    }
}
