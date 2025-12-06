package Arrays;


import Utilities.SwapElements;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr);
        System.out.println("Reversed array is::: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void reverseArray(int[] arr){

        //use two pointers
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            SwapElements.swapIntArray(arr,start,end);
            start++;
            end--;
        }
    }
}
