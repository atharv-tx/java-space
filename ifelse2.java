
    import java.util.Scanner;


/* Name of the class has to be "Main" only if the class is public. */
public class ifelse2 
{
	
	
    public static void main (String[] args) throws java.lang.Exception
	{
		int T,X,Y,i;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(i=0;i<T;i++){
		    
		    X = sc.nextInt();
		    Y = sc.nextInt();
		    int a = sc.nextInt();
		    if (a >=X && a < Y)
		    System.out.println("Yes");
		    else 
		    System.out.println("No");
		}
	}
}


