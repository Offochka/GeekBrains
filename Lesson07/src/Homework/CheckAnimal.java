package Homework;

public class CheckAnimal {
    public static void main(String[] args) {
        Plate plate = new Plate(20,20);

        Cat c01 = new Cat("Мурзик", 5);
        Cat c02 = new Cat("Барсик", 7);
        Cat c03 = new Cat("Тузик", 3);
        Cat c04 = new Cat("Том", 10);
        Cat c05 = new Cat("Черныш", 4);

        Cat [] arrCat = {c01,c02,c03,c04,c05};

        for (Cat cat : arrCat) {
            cat.eat(plate);
        }

        for (Cat cat : arrCat){
            if (cat.CatHungry()) {
                System.out.println(cat.name + " Голодный");
            } else{
                System.out.println(cat.name + " Сытый");
            }
        }
     }
}

