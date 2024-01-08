import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int number_of_line = 1;
        int st =1 ;
        int sp = 2*n-2;

        while (number_of_line <= n){

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
            System.out.println();
            st++;
            sp=sp-2;
            number_of_line++;

        }
        st =n;
        sp =0;
        number_of_line=1;

         while (number_of_line <= n){

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
            System.out.println();
            st--;
            sp=sp+2;
            number_of_line++;

        }
    }
    
}
