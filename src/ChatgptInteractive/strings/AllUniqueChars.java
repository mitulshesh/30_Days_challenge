package ChatgptInteractive.strings;

public class AllUniqueChars {

    public static void main(String[] args) {

    }

    //works for only lower case
    public static boolean allUniqueChars(String s){

        int[] arr = new int[26];

        for(char c :s.toCharArray()){
            if((++arr[c - 'a']) > 1){
                return false;
            }
        }
        return true;
    }

    //All ASCII
    public static boolean allUniqueChars1(String s){

        int[] arr = new int[256];

        for(char c :s.toCharArray()){
            if((++arr[c]) > 1){
                return false;
            }
        }
        return true;
    }


}
