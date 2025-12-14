package CoreJava;


class P{

}

class Q extends P{

}

//Casting checks the runtime object, not the reference variable.
public class Test6 {
    public static void main(String[] args) {
        P obj =new Q();
        Q obj1 = (Q)obj;
    }
}
