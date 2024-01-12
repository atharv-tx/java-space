import java.util.Scanner;


public class factorial {
    

    public static int factoriall(int number){
         int fact=1;
        for(int i =1;i<=number;i++){
            fact = fact*i;

        }
        return fact;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number :");
      int number =sc.nextInt();
        
        int fact = factoriall(number);
        System.out.println("The factorial is :" + fact);

        fact =factoriall(5);
        System.out.println("The factorial is :" + fact);
    }
}
