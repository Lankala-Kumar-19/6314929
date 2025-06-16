public class PushFactory extends NotificationFactory{
    private PushFactory(){}

    private static class PushHelper{
        private static final PushFactory INSTANCE=new PushFactory();
    }

    public static PushFactory getInstance(){
        return PushHelper.INSTANCE;
    }
    public Notification createNotification(){
        return new PushNotification();
    }
}
