package ChatgptInteractive.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsQuestionsSet2 {
    public static void main(String[] args) {


        //count frequency of characters in a string very imp
        String s = "programminpg";
        Map<String, Long> charFreq = Arrays.stream(s.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(charFreq);



        //Find first non-repeating character
        OptionalInt firstNonRepeatingIndex = IntStream.range(0, s.length()).filter(i -> s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))).findFirst();
        System.out.println("First non repeating char::: "+s.charAt(firstNonRepeatingIndex.getAsInt()));



        //Reverse words in a sentence



        //Check for anagrams


        //Remove duplicates from list using Java 8




    }
}
