// package day 10;

public class hybrid_inheritance {
    public static void main(String[] args) {
        //child fish object

        Tuna t1 = new Tuna();
        t1.eat();
        t1.breathes();
        t1.fins = 2;
        System.out.println(t1.fins);
        t1.t_speed = 22;
        System.out.println(t1.t_speed);
        System.out.println();

        //child bird object

        Peacock p1 = new Peacock();
        p1.eat();
        p1.breathes();
        p1.p_speed = 23;
        p1.fly();
        System.out.println(p1.p_speed);
        System.out.println();

        //child mammal object

        Dog d1 = new Dog();
        d1.bite();
        d1.breathes();
        d1.eat();
        d1.walk();
    }
}

class Animal{
    void eat(){
        System.out.println("eats");
    }
    void breathes(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    int fins;
}

class Tuna extends Fish{
    int t_speed;
}

class Shark extends Fish{
    int s_speed;
}

class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}

class Peacock extends Bird{
    int p_speed;
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Dog extends Mammal{
    void bite(){
        System.out.println("bites");
    }
}

class Cat extends Mammal{
    void meow(){
        System.out.println("meows");
    }
}

class Human extends Mammal{
    void speak(){
        System.out.println("speaks");
    }
}
