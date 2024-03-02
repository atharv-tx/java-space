public class Assingment {


    public static void printMatrix(int matrix[][]){
        System.out.println("The Matrix is :");
        for(int i=0; i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++){ 
                System.out.print(matrix[i][j] +" ");
            }System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int row =2; 
        int col =3;

        int matrix[][] = {{2,3,7}, {5,6,7}};

        // Display original matrix 
        printMatrix(matrix);
        
        //Transpose The Matrix 
        int [][] transpose = new int [col][row];
        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        // print the transpose matrix 
        printMatrix(transpose);
    }

        //Count of elements presend in matrix 
    // public static void main(String[] args) {
    //     int array[][] = {{4, 7, 8}, {8,8,7}};
    //     int key =8;
    //     int count=0;

    //     for(int i=0; i<array.length; i++){
    //         for(int j=0; j<array[0].length; j++){
    //             if(array[i][j] == key){
    //                 count++;
    //             }
    //         }
    //     }
    //     System.out.println(count);
    // }
 
    // Sum of 2nd row of matrix 
//     public static void main(String[] args) {
//         int nums[][] = {{1, 4, 9}, {11,4,3},{2,2,3}};
//         ;
//         int sum =0;
        
//         for(int j=0; j<nums.length; j++){
//             sum += nums[1][j];
//         }
//         System.out.println("Sum is :" + sum);
//     }
 }
