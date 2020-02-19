package Homework;
/*5. Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль положительное ли число передали, или
отрицательное; Замечание: ноль считаем положительным числом.*/
public class Task05 {
    public static void main (String[]args) {

        number(5);
    }
    public static void number(int n){
        if (n >= 0) {
            System.out.println("Ваше число является положительным");
        } else {
            System.out.println("Ваше число является отрицательным");
        }
    }

}
