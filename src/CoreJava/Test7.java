package CoreJava;

class R{
    private void m1(){
        System.out.println("class R m1");
    }
}

class S extends R{
    private void m1(){
        System.out.println("class S m1");
    }
}


public class Test7 {

    public static void main(String[] args) {
        R obj = new S();
    }
}
