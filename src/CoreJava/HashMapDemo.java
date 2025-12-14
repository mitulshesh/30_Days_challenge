package CoreJava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String,String> myMap = new HashMap<>();
        String mit = "Mitul";
        String pranu = "Pranali";
        String prisha = "Prisha";
        myMap.put(mit,"Biwi number 1");
        myMap.put(pranu,"Husband number 1");

        int hCode = pranu.hashCode();
        int bucketIndex = hCode & myMap.size() - 1;

        System.out.println("hashcode for Pranali is "+hCode);
        System.out.println("bucket Index for Paranali "+bucketIndex);

        hCode = mit.hashCode();
        bucketIndex = hCode & 16 -1;

        System.out.println("hashcode for Mitul is "+hCode);
        System.out.println("bucket Index for Mitul "+bucketIndex);

        hCode = prisha.hashCode();
        bucketIndex = hCode & 16 -1;

        System.out.println("hashcode for Prisha is "+hCode);
        System.out.println("bucket Index for Prisha "+bucketIndex);



        Student s1= new Student("Mitul",14,"Nursery");
        Student s2 = new Student("Pranali",14,"Junior Kg");

        Map<Student,String>  studentMap = new HashMap<>();
        studentMap.put(s1,"Random");
        studentMap.put(s2,"Random1");

        System.out.println(studentMap);





    }
}
