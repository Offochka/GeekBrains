package Homework;
/*8. * Написать метод, который определяет является ли год високосным, и выводит сообщение
в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
public class Task08 {
    public static void main (String[]args){
        NewYear(2021);
    }
    public static void NewYear(int year){
        if (((year % 4 == 0) && !(year % 100 == 0)) || ( year % 400 ==0 )){
            System.out.println("Год является високосным.");
        }else {
            System.out.println("Год НЕ является високосным.");
        }
    }
}
