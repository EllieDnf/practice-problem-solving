package Array;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {

    public static int[] removeDuplicatesfromSortedArray(int[] nums){
        return Arrays.stream(nums).sorted().distinct().toArray();
    }

    public static int removeDuplicates(int[] nums) {
        int slow=1;
        nums[0]=nums[0];
        for(int fast=1;fast<nums.length;fast++)
        {
            if(nums[fast-1]!=nums[fast])
            {
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args){
        int[]nums=new int[]{1,1,2};
        System.out.print("the result using Stream:   ");
        System.out.print(removeDuplicatesfromSortedArray(nums).length +", ");
        System.out.println(Arrays.toString(removeDuplicatesfromSortedArray(nums)));
        System.out.print("the result using Stream doesnt change the array:   ");
        System.out.println(Arrays.toString(nums));
        System.out.print("the result using an algo changing the array:   ");
        System.out.print(removeDuplicates(nums)+",  ");
        System.out.println(Arrays.toString(nums));
    }
}
