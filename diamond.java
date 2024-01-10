import java.util.Scanner;

public class diamond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int st = 1;
        int sp = n-1;
for(int number_of_line=1; number_of_line <= 2*n-1; number_of_line++){
// print spaces
for(int i=0; i<sp; i++){
System.out.print( "  ");
}
// print stars
for(int i=0; i<st; i++){
System.out.print( "* ");
}
// next line
if(number_of_line<n){
st = st + 2;
sp --;
} else {
st = st - 2;
sp++;
}

System.out.println();
}

}
}
