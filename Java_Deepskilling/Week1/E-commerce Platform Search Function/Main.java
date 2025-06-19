import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void find_linear(String productName,Product[] products){
        for(Product p: products){
            if(p.productName.equalsIgnoreCase(productName)){
                System.out.println(p.toString());
                return;
            }
        }
        System.out.println("No found");
        return;
    }
    public static void find_binary(String productName,Product[] products,int l,int h){
        int low=l,high=h;  
        if(low<high){
            int mid=(low+high)/2;
            int x=productName.compareToIgnoreCase(products[mid].productName);
            if(x==0){
                System.out.println(products[mid].toString());
                return;
            }
            else if(x>0){
                find_binary(productName, products, mid+1, high);
            }
            else{
                find_binary(productName, products, low, mid-1);
            }
        }
        else{
            System.out.println("Not found");
            return;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of products: ");
        int n=sc.nextInt();
        sc.nextLine();
        Product[] products=new Product[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter product name: ");
            String name=sc.nextLine();
            System.out.print("Enter category: ");
            String category=sc.nextLine();
            products[i]=new Product(i+1, name, category);
        }
        
        Arrays.sort(products,new Comparator<Product>() {
            public int compare(Product a,Product b){
                return a.productName.compareToIgnoreCase(b.productName);
            }
        });
        find_linear("apple", products);
        find_binary("banana", products, 0, n);
        sc.close();
    }
}
