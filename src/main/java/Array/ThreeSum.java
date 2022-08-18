package Array;

import java.util.*;

public class ThreeSum {


    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i)
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumII(nums, i, res);
            }
        return res;
    }
    static void twoSumII(int[] nums, int i, List<List<Integer>> res) {
        int lo = i + 1, hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[i] + nums[lo] + nums[hi];
            if (sum < 0) {
                ++lo;
            } else if (sum > 0) {
                --hi;
            } else {
                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                while (lo < hi && nums[lo] == nums[lo - 1])
                    ++lo;
            }
        }
    }
        public static void main(String[] args){
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> fAns= new ArrayList<>();
//        Arrays.sort(nums);
//        int idx=0;
//        while(idx<nums.length-2){
//            int[] temp = new int[nums.length-1-idx];
//            for(int i=idx+1; i<nums.length;i++){
//                temp[i-idx-1]= nums[i];
//            }
//            if(temp[0]+temp[1]+nums[idx]>0) break;
//
//            List<List<Integer>> ans= twoSum(temp,-nums[idx]);
//            if(ans!=null) {
//                for (List lst: ans) {
//                    lst.add(nums[idx]);
//                    if (!fAns.contains(lst)) fAns.add(lst);
//                }
//            }
//            idx++;
//        }
//        return fAns;
//    }
//    public static List<List<Integer>> twoSum(int[]numbers, int target){
//
//        List<List<Integer>> ans = new ArrayList<>();
//        int idxE =1;
//        while( idxE<numbers.length-1 && numbers[0]+numbers[idxE]<=target){
//            idxE++;
//        }
//
//        int idxS=0;
//        while(idxS<idxE){
//            List<Integer> temp = new ArrayList<>();
//            if(numbers[idxS]+numbers[idxE]==target) {
//                temp.add(numbers[idxS]);
//                temp.add(numbers[idxE]);
//                if(!ans.contains(temp)) ans.add(temp);
//                idxS++;
//            }
//            else if(numbers[idxS]+numbers[idxE]<target) idxS++;
//            else idxE--;
//        }
//        return ans;
//
//    }
//
//    public static void main(String[] args){
//        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
//    }
//}
