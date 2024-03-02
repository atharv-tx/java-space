public class RecursionBasics {

    public static void printDec(int n ){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+", ");
        printDec(n-1);
    }

    public static int firstOccurance(int arr[], int key, int i){
        if(i ==arr.length){
            return -1;

        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }

    public static void fullOcurrance(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }

        if(arr[i] == key){
            System.out.print (i+" ");;
        }

         fullOcurrance(arr, key, i+1);  
    }

    public static int lastOccurance(int arr[], int key, int i){

        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
        
    }

    // Power function 
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }

        return x * power(x, n-1);
    }

    // Optimized power function 
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }

        int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);

        // n is odd
        if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }


    public static void main(String[] args) {
         int n =10;
        // printDec(n);
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        System.out.println(firstOccurance(arr, 2, 0));
        System.out.println(lastOccurance(arr, 2, 0));
        fullOcurrance(arr, 2, 0);
        System.out.println( );
        System.out.println(optimizedPower(2, 5));
       
       
       


       // System.out.println(power(2, 10));
        // int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(lastOccurance(arr, 3, 0));
    }
    
}
