public class Inheritance {

    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();

        Dog tomy = new Dog();
       
        tomy.eat();
        tomy.legs =4;
        System.out.println(tomy.legs);
        

    }
}
    // base class
    class Animal{
        String color;

        void eat(){
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("breathes");
        }
    }

    // // derived class 
    // class Fish extends Animal {
    //     int fins ;

    //     void swim(){
    //         System.out.println("Swims in Water ");
    //     }
    // }

    class Mammals extends Animal{
        int legs;
    }

    class Dog extends Mammals{
        String breed;
    }
    

