package Java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        System.out.println(new Test1().removeDuplicates("programming"));

        String s = "mitul";
        s = s.concat("pranali");
        System.out.println(s);
    }

}
