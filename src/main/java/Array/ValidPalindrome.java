package Array;

import java.util.Locale;

public class ValidPalindrome {


    public static boolean isPalindrome(String s) {

        String S = s.toLowerCase();
        StringBuilder newS= new StringBuilder("");
        int a= (int)'a';
        int z= (int)'z';
        int zero=(int)'0';
        int nine= (int)'9';

        for(int i=0;i<s.length();i++) {
            if (((int) S.charAt(i) > (a - 1) && (int) S.charAt(i) <= z)
                 || ((int) S.charAt(i)>= zero && (int) S.charAt(i)<=nine)) newS.append(S.charAt(i));
        }
        return (newS.toString().equals(newS.reverse().toString()));
    }
    public static void main (String[] args){
        System.out.println(isPalindrome("0P"));
    }
}
