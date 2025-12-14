package Strings;

public class StringPoolDemo {

    public static void main(String[] args) {


        String s1 = "mitul"; //string pool
        String s2 = s1.intern();

        System.out.println(s1 == s2);

        String s3=new String("mitul"); //heap
        String s4 = s3.intern();

        System.out.println(s3 == s4);

        System.out.println(s3 == s2);



    }
}
