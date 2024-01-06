
import java.util.Scanner;
public class ifElse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("\nEnter Number....");
        n = scanner.nextInt();
        
        if( n % 2 == 0){

            System.out.println("is even.... ");
        }
        else{

            System.out.println( "is odd.... ");
        }
    }
    
}
