package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(!set.add(n)){
                return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicateUsingStream(int[] nums){
        return !(Arrays.stream(nums).distinct().toArray().length==nums.length);
    }

    public static void main (String[]args){
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }

}
