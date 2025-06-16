public class SmsFactory extends NotificationFactory{
    private SmsFactory(){}

    private static class SmsHelper{
        private static final SmsFactory INSTANCE=new SmsFactory();
    }

    public static SmsFactory getInstance(){
        return SmsHelper.INSTANCE;
    }
    public Notification createNotification(){
        return new SmsNotification();
    }
}
