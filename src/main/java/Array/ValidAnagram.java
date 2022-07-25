package Array;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean validAnagram(String s, String t){
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return (String.valueOf(sChars).equals(String.valueOf(tChars)));
    }

    public static void main (String[] args){
        System.out.println(validAnagram("anagram","nagaram"));
    }

}
