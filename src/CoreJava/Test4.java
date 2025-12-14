package CoreJava;

class Pappa{

    public void m1(){
        System.out.println("Pappa m1()");
    }

    public void m3(){
        System.out.println("Pappa m3()");
    }

}

class Beta extends Pappa{
    public void m2(){
        System.out.println("Beta m1()");
    }

    public void m3(){
        System.out.println("Beta m3() overriden");
    }

}

public class Test4 {

    public static void main(String[] args) {
        Pappa p1 = new Beta();
        p1.m3();
    }
}
