package ChatgptInteractive.arrays;

/*
Given an integer array nums, return the maximum possible sum of any contiguous subarray.

Example:
Input:
[-2,1,-3,4,-1,2,1,-5,4]
Output:
6
(Because [4,-1,2,1] has the largest sum = 6)
 */

public class KadaneAlgorithm {

    public static void main(String[] args) {

    }

    //no negative sum supported
    public static int maxSubArraySum(int[] nums){

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            maxSum = Math.max(maxSum,currentSum);
        }

        return maxSum;
    }

    public static int maxSubarraySumNeg(int[] nums)
    {
        int maxSum = nums[0];
        int currSum = nums[0];

        for(int i=1;i<nums.length;i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }

}
