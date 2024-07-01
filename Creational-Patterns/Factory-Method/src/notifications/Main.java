package notifications;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        
        Notification notification1 = factory.createNotification("SMS");
        notification1.notifyUser();

        Notification notification2 = factory.createNotification("EMAIL");
        notification2.notifyUser();

        Notification notification3 = factory.createNotification("PUSH");
        notification3.notifyUser();
    }
}
