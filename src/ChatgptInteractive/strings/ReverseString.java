package ChatgptInteractive.strings;

import Utilities.SwapElements;

public class ReverseString {

    public static void main(String[] args) {
        String s = "mitula";
        System.out.println(reverseStr(s));
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
