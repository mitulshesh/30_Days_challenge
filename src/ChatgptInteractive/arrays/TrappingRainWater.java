package ChatgptInteractive.arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] bars = {4,2,0,3,2,5};
        System.out.println(maxAreaTrappingRainWater(bars));
    }

    public static int maxAreaTrappingRainWater(int[] bars){

        int leftMax=0;
        int rightMax=0;

        int left = 0;
        int right=bars.length-1;
        int totalWater=0;

        while(left < right){

            if(bars[left] < bars[right]) {

                if (leftMax > bars[left]) {
                    totalWater += leftMax - bars[left];
                } else {
                    leftMax = bars[left];
                }
                left++;
            }else {

                if (rightMax > bars[right]) {
                    totalWater += rightMax - bars[right];
                } else {
                    rightMax = bars[right];
                }
                right--;
            }
        }
        return totalWater;
    }
}
