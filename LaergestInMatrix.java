import java.util.Scanner;

public class LaergestInMatrix {

    public static void largestAndSmallest(int matrix[][]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        for(int i =0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
    
                }
                if(min>matrix[i][j]){
                    min = matrix[i][j];
                } 
                
            }
        }
        System.out.println("Largest in matrix:" + max);
        System.out.println("Smallest in matrix:" +min);
    }

    public static void main(String[] args) {

        int matrix[][] = new int  [3][3];
        Scanner sc =new Scanner(System.in);
        int n=matrix.length, m=matrix[0].length;
       
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

         
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

        largestAndSmallest(matrix);
       


    }
    
}
