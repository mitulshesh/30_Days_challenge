package CoreJava;

class A{
    int x = 20;
    public void show(){
        System.out.println("A");
    }
}

class B extends A{
    int x = 10;
    public void show(){
        System.out.println("B");
    }
}



public class Test {

    public static void main(String[] args) {
        A a=new B();
        System.out.println(a.x);
        a.show();
    }

}
