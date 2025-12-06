package Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSeq {

    public static void main(String[] args) {

        String s = "abcabcaa";

        System.out.println(longestSeq(s));

    }

    public static int longestSeq(String s){

        Set<Character> mySet =new HashSet<>();

        boolean wasInserted = false;

        int l = 0;
        int r = 0;

        int currMax = 0;
        int max = 0;
        while(r < s.length()){

            wasInserted = mySet.add(s.charAt(r));

            if(wasInserted == false){
                mySet.remove(s.charAt(r));
                l++;
            }

            r++;

            currMax = r - l ;
            max = Math.max(currMax,max);

        }
        return max;
    }
}
