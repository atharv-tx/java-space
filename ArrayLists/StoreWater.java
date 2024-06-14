

import java.util.ArrayList;

public class StoreWater {

    // public static int storeWater(ArrayList<Integer> hieght){
    //     int maxWater =0;
    //     // brute forcce
    //     for(int i=0; i<hieght.size(); i++){
    //         for(int j=0; j<hieght.size(); j++){
    //             int ht = Math.min(hieght.get(i), hieght.get(j));
    //             int width =j-1;
    //             int currWater = ht*width;
    //             maxWater = Math.max(maxWater, currWater);
    //         }
    //     }
    //     return maxWater;
    // }

    public static int storeWater(ArrayList<Integer> hieght){
        int maxWater =0;
        // 2 pointer approach 
        int lp =0;
        int rp = hieght.size()-1;

        while(lp < rp){
            // calculate water area - O(n)
            int ht = Math.min(hieght.get(lp), hieght.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
            maxWater = Math.max(maxWater, currWater);
            
            // update ptr
            if(hieght.get(lp) < hieght.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> hieght = new ArrayList<>();

        // 1, 8, 6, 2, 5, 4, 8, 3, 7
        hieght.add(1);
        hieght.add(8);  
        hieght.add(6);
        hieght.add(2);
        hieght.add(5);
        hieght.add(4);
        hieght.add(8);
        hieght.add(3);
        hieght.add(7);
        System.out.println(storeWater(hieght));
    }
    
}
