import java.util.Scanner;

public class simpleIntrest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double simpleIntrest, principle, amount, rate, time;

        System.out.println("\n enter principle :");
        principle = scanner.nextDouble();

        System.out.println("\n enter rate : ");
        rate = scanner.nextDouble();

        System.out.println("\n enter time : ");
        time = scanner.nextDouble();

        simpleIntrest = (principle * rate * time) / 100;
        amount = principle + simpleIntrest;

        System.out.println("principle:" + principle);

        System.out.println("rate:" + rate);

        System.out.println("amount:" + amount);

        System.out.println("\n simple intrest is : " + simpleIntrest);
    }
}
