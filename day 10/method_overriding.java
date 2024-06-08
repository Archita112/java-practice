// package day 10;

public class method_overriding {
    public static void main(String[] args) {
        //prints eat function of child class
        Deer d1 = new Deer();
        d1.eat();

        //prints eat function of parent class
        Animal_1 a1 = new Animal_1();
        a1.eat();
    }
}

class Animal_1{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal_1{
    void eat(){
        System.out.println("eats grass");
    }
}