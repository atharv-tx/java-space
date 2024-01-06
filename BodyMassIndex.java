import java.util.Scanner;

public class BodyMassIndex {

    public static void main (String[]args){

        

        Scanner sc = new Scanner(System.in);
        System.out.println("BMI Calculator");
        double weight;
        System.out.println("Enter Wieght in kilogram:");
        weight = sc.nextDouble();
        double height;
        System.out.println("Enter hieght in feet:");
        height = sc.nextDouble();
        double height1;
        System.out.println("Enter hieght in inches:");
        height1 = sc.nextDouble();
        height = ( height + (height1)/12);
        height = (height*0.304);

        System.out.println(" Your Weight is :"+weight+"kilograms");

        System.out.println("your Height is : "+height+"meters");

        double bmi;
        bmi = (weight/(height+height));
        System.out.println("Your bmi is :" +bmi);

        if(bmi<18.5){

            System.out.println("Underweight");
            
        
        }
        else if (bmi<24.9){
            System.out.println("Normal");
        }
        else if (bmi<29.9){
            System.out.println("Overweight");
        }
         else if (bmi>30){
            System.out.println("Obese");
         }
    }
    
}
