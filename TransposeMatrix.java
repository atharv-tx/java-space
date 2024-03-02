public class TransposeMatrix {

    
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
}
