package Java8;


interface Int1{
     default void m1(){
        System.out.println("Inside m1() method");
    }
}

public class DefaultMethodDemo implements Int1 {

    public static void main(String[] args) {
        DefaultMethodDemo d = new DefaultMethodDemo();
        d.m1();
    }
}
