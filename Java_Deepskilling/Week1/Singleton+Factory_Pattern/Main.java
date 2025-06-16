import java.util.Scanner;

public class Main {
    public static void noti(NotificationFactory nf,String msg){
        Notification n=nf.createNotification();
        n.send(msg);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=1;
        while(n==1){
        System.out.println("1.Email     2.Sms      3.Push");
        System.out.print("Select how you want to send message: ");
        int x=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter text you want to send: ");
        String s=sc.nextLine();
        if(x==1)
        noti(EmailFactory.getInstance(), s);
        else if(x==2)
        noti(SmsFactory.getInstance(), s);
        else if(x==3)
        noti(PushFactory.getInstance(),s);
        else    System.out.println("Enter valid option");
        System.out.print("Do you want to send message again(1- Yes,0-No): ");
        n=sc.nextInt();
        }
        sc.close();
    }
    
}
