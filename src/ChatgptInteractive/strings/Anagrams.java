package ChatgptInteractive.strings;

public class Anagrams {


    public static void main(String[] args) {
        checkAnagram("listen","silent");
    }

    public static boolean checkAnagram(String str1,String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        int[] freq = new int[26];

        for(char c : str1.toCharArray()){
            freq[c - 'a']++;
        }

        for(char c : str2.toCharArray()){
            freq[c - 'a']--;
        }


        for(int x : freq){
            if(x != 0){
                return false;
            }
        }

        return true;

    }

}
