package Java8;

interface A {
    default void show() {
        System.out.println("Default show from A");
    }
}

class B implements A {}

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.show();   // calls default method from A
    }
}
