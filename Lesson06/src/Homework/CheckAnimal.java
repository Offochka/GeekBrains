package Homework;

public class CheckAnimal {
    public static void main(String[] args) {

        Cat c01 = new Cat("Murzik");
        Cat c02 = new OtherCats("Barsik", 4, 400);
        Dog d01 = new Dog("Sharik");
        Dog d02 = new OtherDogs("Barbos",1.5,700,15);

        Animal [] arrAnimal = {c01, c02, d01, d02};

        for (Animal Animal : arrAnimal) {
            Animal.run(300);
            Animal.jump(3);
            Animal.swim(13);
        }
    }
}

