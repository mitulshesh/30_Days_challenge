package ChatgptInteractive.strings;

import java.util.stream.IntStream;


public class FirstUniqueCharacter {

    public static void main(String[] args) {

        String s = "eetcode";
        int index = IntStream.range(0,s.length()).filter(i ->s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))).findFirst().orElse(-1);
        System.out.println(index);
    }
}
