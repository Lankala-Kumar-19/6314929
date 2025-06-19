public class Product {

    int productId;
    String productName,category;
    Product(int productId,String productName,String category){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }
    public String toString(){
        return "ID: "+productId+" || Product name: "+productName+" || Category: "+category;
    }
}