import java.util.*;
 
class pyramindbynum {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<num-i;j++)
            {
                System.out.print(' ');
            }
            for(int j=0; j<2*i-1; j++)
            {
                if(j%2==0)
                {
                    System.out.print(i); // numbers are getting printed because of this
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
 
        }
    }
}