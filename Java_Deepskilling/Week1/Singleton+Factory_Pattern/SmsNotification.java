public class SmsNotification implements Notification{
    public void send(String message){
        System.out.println("sending SMS: "+message);
    }
}
