package Array;

import java.util.Arrays;

public class TwoSumSortedInput {
    public static int[] twoSum(int[] numbers, int target) {

        int idxE =1;
        while( idxE<numbers.length-1 && numbers[0]+numbers[idxE]<=target){
            idxE++;
        }

        int idxS=0;
        while(idxS<idxE){
            if(numbers[idxS]+numbers[idxE]==target) return new int[]{idxS+1,idxE+1};
            else if(numbers[idxS]+numbers[idxE]<target) idxS++;
            else idxE--;
        }
        return null;

//        int[] ans=new int[2];
//        Map<Integer, Integer> nums = new HashMap<>();
//        for(int i=0;i<numbers.length ;i++){
//            nums.put(i,numbers[i]);
//        }
//
//        for(int i=0;i<numbers.length;i++){
//            if(nums.containsValue(target-numbers[i])) {
//                ans[0] = i + 1;
//                break;
//            }
//        }
//
//        for(int i=ans[0];i<numbers.length;i++){
//            if(target-numbers[i]==numbers[ans[0]-1]) ans[1]=i+1;
//        }
//
//        return ans;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[] {5,25,75}, 100)));
    }
}
