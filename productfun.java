import java.util.Scanner;

public class productfun {
    

    public static int multiply(int a , int b){
        int product =  a * b;
        return product;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a : ");
        int a = sc.nextInt();
        
        System.out.println("Enter  b : ");
        int b = sc.nextInt();


        int prod = multiply(a, b);
        System.out.println("product is :"+prod);

         prod = multiply(10, 20);
        System.out.println("product is :"+prod);
    }
}
