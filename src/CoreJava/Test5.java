package CoreJava;

class G{

    public void m1(String s){
        System.out.println("String version");
    }
}

class H extends G{
    public void m1(String s){
        System.out.println("String version overriden in child");
    }
}

public class Test5 {
    public static void main(String[] args) {
        G obj = new H();
        obj.m1(null);
    }
}
