public class Polymorphism {




// Method Overloading 
//     public static void main(String[] args) {
        
  
//     Calculator cal = new Calculator();
//     System.out.println(cal.sum(1, 2));
//     System.out.println(cal.sum((float)1.9, (float)0.9));
//     System.out.println(cal.sum(14, 15, 13));
//   }
    
// }

// class Calculator{
//     int sum(int a, int b){
//         return a+b;
//     }

//     float sum(float a, float b){
//         return a+b;
//     }

//     int sum(int a, int b, int c){
//         return a+b+c;
//     }

public static void main(String[] args) {
    deer d = new deer();
    d.eat();
}
}

    class Animal{
       void  eat(){
            System.out.println("eats anything ");
        }
    }

    class deer extends Animal{
        void eat(){
            System.out.println("eats grass");
        }
    }
