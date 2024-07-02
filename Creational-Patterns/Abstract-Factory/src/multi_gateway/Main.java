package multi_gateway;

public class Main {
    public static void main(String[] args) {
        // Here we are declaring which gateway to use
        String gateway = "PayPal";
        PaymentGatewayFactory factory = null;

        // As this generates a lot of code I've chosen to create just one example,
        // but the idea would be to be able to make new concrete objects from the interfaces and change them here or by similar logic
        if (gateway.equals("PayPal")) {
            factory = new PayPalFactory();
        }

        ECommerceApplication app = new ECommerceApplication(factory);
        app.processOrder(100.0, "TEST123456");
    }
}
