package Java8;

import java.util.Comparator;
import java.util.List;

public class StreamBasics {

    public static void main(String[] args) {

        List<String> myList = List.of("yeFirst","Prisha","Mote","Pranali","Mitul","abc","zycf","prasun");
        //myList.stream().filter(name->name.startsWith("P")).forEach(System.out::println);
        myList.parallelStream().limit(2).forEach(System.out::println);

        System.out.println("###### Stateless Operations #######");
        //Stateless operations
        myList.stream().filter(name -> {
            System.out.println("Doing fiter for "+name);
            return name.startsWith("P");
        })
                .map(name -> {
                    System.out.println("Applying map to "+name);
                    return name+ name.length();
                })
                .forEach(System.out::println);

        System.out.println("###### Stateful Operations #######");
        //Stateful Operations
        myList.parallelStream().filter(name -> {
                    System.out.println("Doing fiter for "+name+ " executed by "+Thread.currentThread().getName());
                    return name.startsWith("P");
                }).sorted()            //Added sorted which is stateful
                .map(name -> {
                    System.out.println("Applying map to "+name+ " executed by "+Thread.currentThread().getName());
                    return name+ name.length();
                }).sorted(Comparator.comparingInt(String::length).reversed())
                .map(s ->
                {
                    System.out.println("Applying uppercase using map for "+s + "executed by "+Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .forEach(System.out::println);

        System.out.println("### Parallel Stream ######");
        myList.parallelStream().filter(name -> {
                    System.out.println("##Doing filter for "+name+ " executed by "+Thread.currentThread().getName());
                    return name.startsWith("P");
                }).sorted()            //Added sorted which is stateful
                .map(name -> {
                    System.out.println("##Applying nameLength map to "+name+" Executed by "+Thread.currentThread().getName());
                    return name+ name.length();
                }).sorted(Comparator.comparingInt(String::length).reversed())
                .map(s ->
                {
                    System.out.println("##Applying uppercase using map  for "+s+ " executed by "+Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .forEach(System.out::println);

    }
}
