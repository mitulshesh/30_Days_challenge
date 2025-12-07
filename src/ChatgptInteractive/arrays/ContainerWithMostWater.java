package ChatgptInteractive.arrays;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(calculateMaxArea(heights));
    }

    public static int calculateMaxArea(int[] heights){

        int start = 0;
        int end = heights.length - 1;
        int maxArea = 0;
        int currentArea;

        while(start < end){

            currentArea = (end - start) * Math.min(heights[start],heights[end]);
            maxArea = Math.max(maxArea,currentArea);
            if(heights[start] < heights[end]){
                start++;
            }else if(heights[start] >= heights[end]){
                end --;
            }
        }
        return maxArea;
    }
}
