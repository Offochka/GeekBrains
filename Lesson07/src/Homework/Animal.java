package Homework;

public abstract class Animal {
    protected String name;
    protected double MaxHeighJump = 0;
    protected int MaxLenghtRun = 0;
    protected int MaxLenghtSwim = 0;

    public Animal(String name) {
        this.name = name;
    }

    public void jump(double height) {
        if ((height >= 0) && (height <= MaxHeighJump)) {
            System.out.println(this.name + " Прыгает на  " + height + "м");
        } else {
            System.out.println(this.name + " Не может прыгнуть на столько " + height + "м");
        }
    }

    public void run(int lenght) {
        if ((lenght >= 0) && (lenght <= MaxLenghtRun)) {
            System.out.println(this.name + " Пробегает " + lenght+ "м");
        } else {
            System.out.println(this.name + " Не может пробежать " + lenght+ "м");
        }
    }

    public void swim(int lenght) {
        if ((lenght >= 0) && (lenght <= MaxLenghtSwim)) {
            System.out.println(this.name + " Проплывает " + lenght + "м");
        } else {
            System.out.println(this.name + " Не может проплыть " + lenght + "м");
        }
    }
    public void thanks(){
        System.out.println("Мяус");
    }
}