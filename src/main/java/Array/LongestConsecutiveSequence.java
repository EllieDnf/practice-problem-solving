package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int max=1;
        Arrays.sort(nums);
        int curNumCons=1;
        for(int i= 0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) continue;
            if(nums[i]+1==nums[i+1]){
                curNumCons++;
                if(max<curNumCons) max=curNumCons;
            }
            else{
                curNumCons=1;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums= new int[]{ 0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
