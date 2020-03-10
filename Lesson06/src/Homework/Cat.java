package Homework;

public class Cat extends  Animal {
    public Cat (String name){
        super("Cat " + name);
        MaxHeighJump = 2;
        MaxLenghtRun = 200;
    }

    public void swim(int lenght) {
        System.out.println(name + " swim: false (Сats do not swim)");
    }

}
