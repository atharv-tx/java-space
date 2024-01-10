import java.util.Scanner;

public class Pattern3 {
    
public static void main(String[] args) {
    

Scanner sc = new Scanner(System.in);
System.out.print("Enter number of lines: ");
int n = sc.nextInt();

int number = 1;
for(int i = 1; i <= n; i++){
for(int j = 1; j <= i; j++){
System.out.print(number + " ");
if(number == 1){
number = 0;
}
else if(number == 0){
number = 1;
}
}

System.out.println();
}
}
  }
 