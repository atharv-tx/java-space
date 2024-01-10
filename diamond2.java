import java.util.*;
public class diamond2
{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int spaces=n-1;
      int stars=1;
      for(int i=1;i<=n;i++){
          for(int j=1;j<=spaces;j++){
              System.out.print("  ");
          }
          for(int j=1;j<=stars;j++){
              System.out.print("* ");
          }
          for(int j=1;j<=spaces;j++){
              System.out.print("  ");
          }
          System.out.println();
          spaces--;
          stars+=2;
      }
      spaces=0;
      stars=2*n-1;

      
      for(int i=1;i<=n;i++){
          for(int j=1;j<=spaces;j++){
              System.out.print("  ");
      }
      for(int j=1;j<=stars;j++){
          System.out.print("* ");
      }
      for(int j=1;j<=spaces;j++){
          System.out.print("  ");
      }
      System.out.println();
      spaces++;
      stars-=2;
      }
    }
}