package notifications;

public class NotificationFactory {
    public Notification createNotification(String type){
        if(type == null || type.isEmpty()) return null;
        switch (type) {
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            case "SMS":
                return new SmsNotification();
            default:
                System.out.println("unknow notification type" + type);
        }
        return null;
    }
}
