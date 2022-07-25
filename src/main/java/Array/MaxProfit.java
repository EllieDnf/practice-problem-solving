package Array;

public class MaxProfit {

    public static int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            res += Math.max(prices[i] - prices[i - 1], 0);
        }
        return res;
    }

    public static int maxProfit2(int[] prices) {
        int profit=0;
        int length= prices.length-1;
        for(int i=0;i<length;i++){
            int min=prices[i];
            while(i<length && prices[i]<prices[i+1]){
                i++;
            }
            int max=prices[i];
            profit+=max-min;
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        System.out.println(maxProfit(array));
    }
}