package ChatgptInteractive.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDupsFromString {

    public static void main(String[] args) {
            System.out.println(removeDups("programming"));
    }

    public static String removeDups(String s){
        //s.chars() → converts string to an IntStream
        //distinct() → removes duplicates keeping first occurrence
        //mapToObj(c -> String.valueOf((char)c)) → converts int → character → string
        //Collectors.joining() → joins characters back into a single string

       //String processedString = s.chars().distinct().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining());
        String processedString = Arrays.stream(s.split("")).distinct().collect(Collectors.joining());
       return processedString;
    }
}
