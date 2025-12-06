package ChatgptInteractive.arrays;

public class BestTimeBuySellStock {

    public static void main(String[] args) {

    }

    //max profit
    public static int buySellStock(int[] nums){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i<nums.length;i++){
            if(nums[i] < minPrice){
                minPrice = nums[i];
            }
            maxProfit = Math.max(maxProfit,nums[i] - minPrice);
        }
        return maxProfit;
    }
}
