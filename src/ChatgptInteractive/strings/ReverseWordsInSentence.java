package ChatgptInteractive.strings;


import Utilities.SwapElements;


public class ReverseWordsInSentence {

    public static void main(String[] args) {
        System.out.println(reverseWordsInSentence("mitul is a good boy"));
    }

    public static String reverseWordsInSentence(String str){

        String[] strArray = str.split(" ");

        int start = 0;
        int end = strArray.length -1;

        while (end > start){
            SwapElements.swapStringArray(strArray,start,end);
            start++;
            end--;
        }

        return String.join(" ", strArray);
    }
}
