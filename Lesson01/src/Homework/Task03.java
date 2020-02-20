package Homework;
/*3. Написать метод вычисляющий выражение a * (b + (c / d))
и возвращающий результат,где a, b, c, d – входные параметры этого метода;*/
public class Task03 {
    public static void main (String [] args){

        System.out.println(formula(2,2,5,5));
    }
    public static int formula (int a, int b,int c, int d) {
        return  a*(b+(c/d));
    }
}
