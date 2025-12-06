package ChatgptInteractive.arrays;

import Utilities.SwapElements;

public class MoveZerosToEnd {

    public static void main(String[] args) {

    }

    public static void moveZerosToEnd(int[] nums){
        //j holds the index of the first zero always
        int j = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1) return;

        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                SwapElements.swapIntArray(nums,i,j);
                j++;
            }
        }
    }
}
