package multi_gateway;

interface TransactionalValidator {
    boolean validateTransaction(String transactionalId);
}
