package CoreJava;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Student> mySet = new HashSet<>();

        Student s1= new Student("Mitul",12,"Nursery");
        Student s2 = new Student("Pranali",12,"Junior Kg");

        mySet.add(s1);
        mySet.add(s2);

        System.out.println(mySet);

        TreeSet<Student> studentSet = new TreeSet<>(Comparator.comparing(Student::getRollNo));

        studentSet.add(s1);
        studentSet.add(s2);

        System.out.println(studentSet);



    }
}
