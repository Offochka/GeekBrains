package Homework;

public class Cat extends  Animal {
    private boolean hungry = true;
    private int appetite;

    public Cat (String name, int appetite){
        super("Кот " + name);
        this.MaxHeighJump = 2;
        this.MaxLenghtRun = 200;
        this.appetite = appetite;
    }

    public void swim(int lenght) {
        System.out.println(name + " Коты не плавают");
    }

    public boolean CatHungry() {
        return hungry;
    }

    public void eat(Plate plate) {
        if (plate.checkFood(this.appetite)) {
            plate.fallFood(this.appetite);
            System.out.println(this.name + " ест из миски " + this.appetite + " еды");
            hungry = false;
        } else{
            System.out.println("В миске кончилось еда, наполняем...");
            plate.fullPlate();
            eat(plate);
        }
    }
}
