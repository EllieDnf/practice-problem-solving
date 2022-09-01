package Array;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxW=0;
        int lP=0;
        int rP=height.length-1;
        while (lP<rP){
            int temp= Math.min(height[lP], height[rP])*(rP-lP);
            if(maxW<temp) maxW=temp;
            if(height[lP]< height[rP]) lP++;
            else rP--;
        }
        return maxW;
    }

    public static void main(String [] args){
        System.out.println(maxArea(new int[]{1,1000,1000,6,2,5,4,8,3,7}));
    }
}
