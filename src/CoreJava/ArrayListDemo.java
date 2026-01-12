package CoreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDemo {

    public static void main() {

        List l = new ArrayList();
        l.add("mitul");
        l.add(100);
        l.add(new String("pranali"));

        System.out.println(l.get(2));

    }
}
