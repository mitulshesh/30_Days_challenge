package ChatgptInteractive.strings;

import Utilities.SwapElements;

public class PallindromeIgnoreSpaceSpecialChar {

    public static void main(String[] args) {
        checkIfPallindrome("M 886786 ada **** m");
    }

    public static boolean checkIfPallindrome(String s){
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]",""); // Replace anything than alphanumeric
        String reverserdStr = reverseStr(cleanedString);
        if(cleanedString.equalsIgnoreCase(reverserdStr)){
            return true;
        }else{
            return false;
         }
    }

    public static String reverseStr(String s){
        /// two pointers
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length-1;


        while(end > start){
            SwapElements.swapCharArray(arr,start,end);
            start++;
            end--;
        }

        return String.valueOf(arr);
    }




}
