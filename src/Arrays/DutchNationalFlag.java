package Arrays;

import Utilities.SwapElements;

// low → boundary for 0s before this index all are zeros .. isiliye ++
// mid → current element
// high → boundary for 2s after this index all are 2s ..isiliye --

public class DutchNationalFlag {

    public static void main(String[] args) {
        int[] arr = {2,2,1,0,1,2,2};
        seg0s1s2s(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void seg0s1s2s(int[] arr){

        int start = 0;
        int mid = 0;
        int end = arr.length - 1;

        while(mid <= end){
            if(arr[mid] == 0 ){
                SwapElements.swapIntArray(arr,start,mid);
                start ++;
                mid ++;
            }
            else if(arr[mid] == 1){
                mid ++;
            }else{
                //now we know its only 2
                SwapElements.swapIntArray(arr,mid,end);
                end--;
            }
        }
    }
}
