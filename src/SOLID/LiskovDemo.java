package SOLID;


import java.util.Arrays;
import java.util.List;

class Product{
    public double discount = 2;

    public double getDiscount(){
        return this.discount;
    }
}

class InhouseProduct extends Product{

    public double getDiscount(){
        return getExtraDiscount();
    }

    public double getExtraDiscount(){
        return this.discount * 1.5;
    }
}

public class LiskovDemo {

    public static void main(String[] args) {

        Product a = new Product();
        Product b =new Product();
        Product c = new InhouseProduct();

        List<Product> l = Arrays.asList(a,b,c);

        for(Product p : l){
            System.out.println(p.getDiscount());
        }
    }
}
