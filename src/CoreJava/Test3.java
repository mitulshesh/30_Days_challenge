package CoreJava;

class E{

}

class F extends E{

}

public class Test3 {
    public static void main(String[] args) {
        E e = new F();
        System.out.println(e instanceof E); //F is-a E, thus true
        System.out.println(e instanceof F); //true
    }
    //instanceof always evaluates based on the runtime object type, not the reference variable.
}
