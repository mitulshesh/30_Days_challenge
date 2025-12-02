package Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {12,35,1,10,34};
        System.out.println(calculateSecondHighest(arr));
    }

    private static int calculateSecondHighest(int[] arr){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i]!=largest){ //arr[i] !=largest is to skip dups
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
