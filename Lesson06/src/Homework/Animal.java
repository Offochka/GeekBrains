package Homework;

public abstract class Animal {
    protected String name;
    protected double MaxHeighJump = 0;
    protected int MaxLenghtRun = 0;
    protected int  MaxLenghtSwim = 0;

   public Animal (String name){
       this.name = name;
   }

    public void jump(double height) {
        if ((height >= 0) && (height <= MaxHeighJump)) {
            System.out.println(this.name + " jump: true " + height);
        }
        else {
            System.out.println(this.name + " jump: false " + height);
        }
    }

    public void run(int lenght) {
        if ((lenght >= 0) && (lenght <= MaxLenghtRun)) {
            System.out.println(this.name + " run: true " + lenght);
        }
        else {
            System.out.println(this.name + " run: false " + lenght);
        }
    }

    public void swim(int lenght) {
        if ((lenght >= 0) && (lenght <= MaxLenghtSwim)) {
            System.out.println(this.name + " swim: true " + lenght);}
        else {
            System.out.println(this.name + " run: false " + lenght);
        }
   }
}
