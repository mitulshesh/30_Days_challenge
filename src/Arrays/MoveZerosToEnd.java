package Arrays;

import Utilities.SwapElements;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZerosToEnd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



    private static void moveZerosToEnd(int[] arr){

        //we will have one pointer that will always point to a FIRST zero in the array --say z
        int z = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                z = i; //saves the index of the first zero encountered in the array
                break;
            }
        }

        //if the array doesnot contain any zeros
        if(z == -1){
            return;
        }

        //run loop from z+1 till the end and keep swapping if the number at that index is non zero
        for(int  i =z+1;i<arr.length;i++){
            if(arr[i]!=0){
                SwapElements.swapIntArray(arr,i,z);
                z++;
            }
        }
    }
}
