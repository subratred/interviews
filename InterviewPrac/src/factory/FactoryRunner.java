package factory;

public class FactoryRunner {

	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("Push");
        notification.display();
	}

}
