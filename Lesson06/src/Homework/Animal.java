package Homework;

public abstract class Animal {
    public final double MaxHeighJump = 0;
    public final int MaxLenghtRun = 0;
    public final int  MaxLenghtSwim = 0;

    public abstract void jump(double height);
    public abstract void run(int lenght);
    public  abstract void swim(int lenght);

}
