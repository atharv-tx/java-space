import java.util.Scanner;

public class EMI {

   public static void main (String[]args){

    double loanAmount;
    double R,N,EMI;

    Scanner scanner = new Scanner(System.in);
    System.out.println("\n Enter loan amount :");
    loanAmount=scanner.nextDouble();
    
    System.out.println("\n Enter Interest per month  : ");
    R=scanner.nextDouble();

    System.out.println("\n Enter No. of Years  ");;
    N=scanner.nextDouble();

    R=R/(12/100);
    N=N*12;



    EMI = (loanAmount*R*Math.pow(1+R,N))/(Math.pow(1+R,N)-1);

    System.out.println("\n  Principle amount : "+loanAmount);
    System.out.println("\n  Intrest per month : "+R);
    System.out.println("\n  NO. Of Years : "+N);
    System.out.println("\n  Monthly EMI  : "+EMI);


   } 
    
}
