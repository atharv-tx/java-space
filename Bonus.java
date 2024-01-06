
    import java.util.Scanner;
public class Bonus {

     public static void main(String[] args){
         double salary,years;

         Scanner scanner = new Scanner(System.in);

         System.out.println("\n Enter Salary of Employee : ");
         salary = scanner.nextDouble();

         System.out.println("\n Enter no of years of Employee : ");
         years = scanner.nextDouble();
         if (salary>=22000 & years>=5) {
             System.out.println("\n Bonus will be given to Employee.... ");
         }
         else{
             System.out.println("\n Bonus will not given to Employee....");
         }
     }
}

    

