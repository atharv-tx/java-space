import java.util.Scanner;


public class factorial {
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number :");
      int number =sc.nextInt();
        int fact=1;
        for(int i =1;i<=number;i++){
            fact = fact*i;

        }
        System.out.println("The factorial is :" + fact);

    }
}
