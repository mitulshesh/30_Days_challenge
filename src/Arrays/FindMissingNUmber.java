package Arrays;

public class FindMissingNUmber {

    public static void main(String[] args) {


        int[] arr = {1,2,4,5,6};

        int n = arr.length + 1;

        int expSum = n*(n+1)/2;

        int sum = 0;

        for(int x : arr){
            sum+=x;
        }

        System.out.println(expSum - sum);


    }
}
