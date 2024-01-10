import java.util.Scanner;

public class Pattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int number_of_line =1;

        
        int st = n;
        int sp = n-2;
        
        while(number_of_line <=n-1){
            if(number_of_line==1 || number_of_line==n-1){

                // print n stars 
                for(int i=0; i<st; i++){
                System.out.print("* ");
                }
            } else{
                // print one star 
                System.out.print("* ");

                //print spaces 
                for(int i =0; i<sp; i++){
                    System.out.print("  ");
                }
                // print one star 
                System.out.print("* ");
            }
            // next line 
            System.out.println();
            number_of_line++;

        }
    }

}
