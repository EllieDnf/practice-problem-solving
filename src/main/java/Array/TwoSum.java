package Array;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[]nums, int target){

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.get(target - nums[i]) != null) {
                return new int[] {map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4},6)));
    }


}
