package Homework;

public class Dog extends Animal {
    public final double MaxHeighJump = 0.5;
    public final int MaxLenghtRun = 500;
    public final int  MaxLenghtSwim = 10;

    @Override
    public void jump(double height) {
        if ((height >= 0) && (height <= MaxHeighJump)) {
            System.out.println("jump: true");
        }
        else {
            System.out.println("jump: false");
        }
    }
    @Override
    public void run(int lenght) {
        if ((lenght >= 0) && (lenght <= MaxLenghtRun)) {
            System.out.println("run: true");
        }
        else {
            System.out.println("run: false");
        }
    }
    @Override
    public void swim(int lenght) {
        if ((lenght >= 0) && (lenght <= MaxLenghtSwim)) {
            System.out.println("run: true");
        }
        else {
            System.out.println("run: false");
        }
    }
}
