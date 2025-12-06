package ChatgptInteractive.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeq {

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2,201,202,203,204};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums){

        Set<Integer> mySet = new HashSet<>();
        //put all elements int the set
        for(int num : nums){
            mySet.add(num);
        }

        int maxLength=0;
        for(int num : nums){
            if(!mySet.contains(num - 1)){
                //if this condition is satisfied means means this is start of a sequence
                int currLength = 0;
                int curr = num;
                while(mySet.contains(curr)){
                    curr++;
                    currLength++;
                }
                maxLength = Math.max(maxLength,currLength);
            }
        }
        return maxLength;


    }
}
