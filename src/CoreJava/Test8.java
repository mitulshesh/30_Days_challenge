package CoreJava;

public class Test8 {
    static void main() {

        Object obj1 = 5689;
        Object obj2 = "Mitul";

        if(obj1 instanceof Integer intVal){
            System.out.println(intVal);
        }

        if(obj2 instanceof String str){
            System.out.println(str);
        }

        //if(obj1 instanceof String){
            String str1 = (String)obj1;
            Integer int1 = (Integer) obj1;
           // System.out.println(str1);
        //}

    }
}
