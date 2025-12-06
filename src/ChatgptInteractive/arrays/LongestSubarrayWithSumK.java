package ChatgptInteractive.arrays;


/*
Find the length of the longest subarray with sum = K

Example:
Input:

arr = [10, 5, 2, 7, 1, 9], K = 15


Output:
4
 */
public class LongestSubarrayWithSumK {

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int target = 15;
        System.out.println(longestSubArrayWithSumk(nums,target));
    }

    public static int longestSubArrayWithSumk(int[] nums, int target){

        //holds current window start
        int j = 0;
        int currSum = 0;
        int maxLength = 0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];

            while(currSum > target){
                currSum-=nums[j];
                j++; //move start ahead
            }

            if(currSum == target){
                maxLength = Math.max(maxLength,i - j + 1);
            }
        }
        return maxLength;
    }
}
