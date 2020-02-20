package Homework;
/*5. Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль положительное ли число передали, или
отрицательное; Замечание: ноль считаем положительным числом.*/
public class Task05 {
    public static void main (String[]args) {

       System.out.println("Ваше число является" + ((number(5)?(" положительным"):(" отрицательным"))));
    }
    public static boolean number(int n){
        return (n >= 0) ;
    }
}
