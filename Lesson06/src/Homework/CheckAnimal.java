package Homework;

public class CheckAnimal {
    public static void main(String[] args) {
        System.out.println("Cats");

        Cat cat1 = new Cat();
        cat1.run(250);
        cat1.jump(1.5);
        cat1.swim(5);

        System.out.println("Dogs");

        Dog dog1 = new Dog();
        dog1.run(5);
        dog1.jump(10);
        dog1.swim(1);
    }
}

