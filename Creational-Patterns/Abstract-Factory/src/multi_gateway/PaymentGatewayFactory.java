package multi_gateway;

interface PaymentGatewayFactory {
    PaymentProcessor createPaymentProcessor();
    TransactionalValidator createTransactionalValidator();
    FraudChecker createFraudChecker();
}
