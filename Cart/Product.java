package Cart;

public abstract class Product {


    String name;
    int price;
    double point;


    Product(int price){
        this.price=price;
        this.point=(double) (price*0.1);


    }

}
