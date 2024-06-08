public class abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        //we cannot create objects of abstract class
        // Animal a = new Animal();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("horse walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("chicken walks on 2 legs");
    }
}