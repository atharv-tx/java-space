import java.util.Scanner;

 class New {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, t;
        System.out.println("\n Enter the Number : ");
        n = scanner.nextInt();

        for (i = 1; i <= 10; i++) {
            t = n * i;
            System.out.print(t + " ");

        }

    }
}
