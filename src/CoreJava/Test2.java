package CoreJava;

class C {
    private void m() {
        System.out.println("A");
    }

    void call() {
        m();
    }
}

class D extends C {
    void m() {
        System.out.println("B");
    }
}


public class Test2 {
    public static void main(String[] args) {
        C c = new D();
        c.call();
    }
}
