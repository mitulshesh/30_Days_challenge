package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {


        Map<Integer,String> tm = new HashMap<>();

        tm.put(2000, "mitul");
        tm.put(1 , "prisha");
        tm.put (200 , "mumma");
        tm.put (300, "pappa");
        tm.put (3000, "pranali");

        System.out.println(tm);

        for(Map.Entry e : tm.entrySet()){
            System.out.println(e.getKey());
        }
    }
}
