package Homework;

public class Cat extends  Animals {
    public final double MaxHeighJump = 2;
    public final int MaxLenghtRun = 200;

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
        System.out.println("swim: false");
    }

}
