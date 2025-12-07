package ChatgptInteractive.arrays;

public class PairSumSorted {

    public static void main(String[] args) {

    }

    public static boolean pairSum(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        int currentSum = 0;

        while(start < end){

            currentSum = arr[start]+ arr[end];
            if(currentSum == target){
                return true;
            }
            else if(currentSum > target){
                //current sum is greater so we need to reduce thus doing end--
                end --;
            }else{
                //current sum is less than target thus we need to increase, thus start++
                start++;
            }
        }
        return false;
    }


}
