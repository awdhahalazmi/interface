package inter;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        Animal myDog = new Dog();
        myCat.eat();
        myCat.sleep();
        myCat.makeSound();
        myDog.eat();
        myDog.sleep();
        myDog.makeSound();
        // System.out.println("Cat " + myCat.eat());
        // System.out.println("Dog eats: " + myDog());
    }
}
