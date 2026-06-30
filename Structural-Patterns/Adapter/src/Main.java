public class Main {
    public static void main(String[] args) {
        Laptop laptopA = new Laptop(new TypeAPlugAdapter(new TypeAOutlet()));
        laptopA.charge();

        Laptop laptopB = new Laptop(new TypeBPlugAdapter(new TypeBOutlet()));
        laptopB.charge();
    }
}
