import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        
        int st =1 ;
        int sp = 2*n-2;

        for (int number_of_line=1; number_of_line <= 2*n; number_of_line++){

            // print stars 
            for(int i=0;i<st; i++){
                System.out.print("* ");
            }

            // print spaces 
            for(int i=0;i<sp; i++){
                System.out.print("  ");
            }

            //print stars 

            for(int i=0;i<st; i++){
                System.out.print("* ");
            }
            // nxt line 
            if(number_of_line<n){
                st++;
                sp=sp-2;
            }else if(number_of_line>n) {
                st--;
                sp=sp+2;
            }
            System.out.println();
            

        }
       
        
    }
    
}
