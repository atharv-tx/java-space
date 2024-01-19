import java.util.*;


// Brute force Method ....

public class sumofsubarray {

public static void printsumofSubarray(int numbers[]){
   int max = Integer.MIN_VALUE;
   int min = Integer.MAX_VALUE;
    for(int i=0; i<numbers.length; i++){
        
        for(int j=i; j<numbers.length; j++){
            int sum =0;
            for(int k =i; k<=j; k++){
                System.out.print(numbers[k]+" ");
                sum = sum + numbers[k];
             
            }
            System.out.print("sum of subarrays : " + sum);
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            sum=sum-1; 
            System.out.println();
        }

        System.out.println();
    }
    System.out.println("Maximum value of the sums of subarrays :" + max);
    System.out.println("Minimum value of the sums of subarrays :" + min);
}

public static void main(String[] args) {
    
    int numbers[] = {2, 4, 6, 8, 10, 12, 14};
    printsumofSubarray(numbers); 
}
}
