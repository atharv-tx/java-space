public class TrappedWater {


    public static int  trappedWater(int height[]){
        int n = height.length;
        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);

        }

        // calculaate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i =n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);

        }
        int trappedWater = 0;
        // loop
        for(int i = 0; i<n; i++) {
            // waterlevel = min(leftmax bound , rightmax bound )
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel - height[i]
            trappedWater += waterLevel-height[i];
  }

        return trappedWater;
    }
    public static void main(String[]args){
        int height[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 6};
        System.out.println(trappedWater(height));
    }
    
}
