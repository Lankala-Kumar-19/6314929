import java.util.Scanner;

public class Main {

    public static double forecast(double value,double interestRate,int years){
        if(years==0)    return value;
        return forecast(value,interestRate,years-1)*(1+interestRate);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter current value: ");
         double value=sc.nextDouble();
         sc.nextLine();
         System.out.print("Enter interest rate: ");
         double rate=sc.nextDouble();
         sc.nextLine();
         System.out.print("Enter no of years: ");
         int years=sc.nextInt();
         sc.nextLine();
         System.out.println("The forecasted money after "+years+" years ("+value+".0 * ("+(1+rate)+")^"+years+") = "+forecast(value, rate, years));
         sc.close();
    }
}