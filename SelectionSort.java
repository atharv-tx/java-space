public class SelectionSort {

    public static void selectionSort(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                    
                }
            }
            // swap 
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 6, 1, 3, 4, 7, 5};
        selectionSort(arr);
        printArray(arr);

     }
    
}

    

