package Array;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> str = new HashSet<>();
        if(s.length()==0) return 0;
        str.add(s.charAt(0));
        int longest=1;
        int i =1;
        while( i<s.length() && s.charAt(0)==s.charAt(i)){
            i++;
        }
        int currentPosition =i-1; //i-1

        while(i<s.length()) {
            while (i<s.length() && str.add(s.charAt(i))) {
                 str.add(s.charAt(i));
                i++;
            }
            longest = Math.max(str.size(), longest);

            while(currentPosition<s.length() && i<s.length() && str.contains(s.charAt(i))){
                str.remove(s.charAt(currentPosition));
                currentPosition++;
            }
        }
        return longest;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }


}
