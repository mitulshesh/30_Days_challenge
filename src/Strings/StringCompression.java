package Strings;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compressString("aaabbbbccc"));
    }

    private static String compressString(String s){

        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                stringBuilder.append(s.charAt(i-1)).append(count);
                count = 1;
            }
        }

        //append the last distinct element
        stringBuilder.append(s.charAt(s.length()-1)).append(count);

        return stringBuilder.toString();
    }
}
