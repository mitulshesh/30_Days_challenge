package Java8;

class Sample{
    public Sample(){
        System.out.println("No args constructor");
    }

    public Sample(String s){
        System.out.println("one arg constructor "+s);
    }
}

interface Int2{
    Sample get(String s);
}


public class MethodAndConstructorRef {

    public static void main(String[] args) {

        Int2 i = Sample::new;
        i.get("abc");



    }



}
