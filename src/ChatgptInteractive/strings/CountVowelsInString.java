package ChatgptInteractive.strings;

import java.util.Arrays;
import java.util.List;

public class CountVowelsInString {


    public static void main(String[] args) {

    }

    public static int countVowels(String s){

        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        int count = 0;

        for(char c : s.toLowerCase().toCharArray()){
            if(vowels.contains(c)){
                count++;
            }
        }

        return count;
    }


}
