package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

    public String removeDuplicates(String s){

        Set<Character> mySet =new HashSet<>();
        char[] chararray = s.toCharArray();
        List<String> myList = new ArrayList<>();
        for(char c : chararray){
            myList.add(String.valueOf(c));
        }

        String toreturn = myList.stream().distinct().reduce("aaaaa",String::concat);
        return toreturn;




    }

    public static void main(String[] args) {
//        System.out.println(new Test1().removeDuplicates("programming"));
//
//        String s = "mitul";
//        s = s.concat("pranali");
//        System.out.println(s);

//        List<String> stringList = List.of("Mitul","Pranali","Prisha");
//        String[] strSplitted = "Mitul".split("");
//        for(String s : strSplitted){
//            System.out.println(s);
//        }


        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(collect);

        Arrays.stream(arr).boxed().filter(i -> i%2==0).collect(Collectors.toList());


        String[] strArr = {"Mitul","Pranali","Prisha"};
        List<String> convertedList = Arrays.stream(strArr).collect(Collectors.toUnmodifiableList());
        System.out.println(convertedList);
    }

}
