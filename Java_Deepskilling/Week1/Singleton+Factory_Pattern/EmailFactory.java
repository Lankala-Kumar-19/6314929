public class EmailFactory extends NotificationFactory{

    private EmailFactory(){}

    private static class EmailHelper{
        private static final EmailFactory INSTANCE=new EmailFactory();
    }
    public static EmailFactory getInstance(){
        return EmailHelper.INSTANCE;
    }

    public Notification createNotification(){
        return new EmailNotification();
    }
}
