package Array;

import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency =new TreeMap<>();
        for( int i=0;i<nums.length;i++){
            if(!frequency.containsKey(nums[i])){
                int n=1;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==nums[i]) n++;
                }
                frequency.put(nums[i],n);
            }
        }
        int[] topFreq = new int[k];
        Object[] sortedvalue= frequency.values().stream().sorted().toArray();
//        System.out.println('VALUES'+frequency.values());
//        System.out.println('KEYS'+frequency.keySet());
        int count=0;
        while(count<k){
            for(Map.Entry<Integer, Integer> entry: frequency.entrySet()) {
                if(entry.getValue() == sortedvalue[sortedvalue.length-1-count] && count<k) {
                    topFreq[count]=entry.getKey();
                    count++;
                }
            }
        }
        return  topFreq;
    }
    public static void main(String[] args){
        char a = 'A';
        System.out.println((int) a);
        //System.out.println(Arrays.toString(topKFrequent(new int[]{3,2,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,3,7,8,5,6} ,10)));
    }
}
