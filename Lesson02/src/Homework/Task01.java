package Homework;
import java.util.Arrays;
/*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и
 условия заменить 0 на 1, 1 на 0; */
public class Task01 {
    public static void main(String[] args) {
        int[] arr0 = {0, 1, 1, 0, 0, 0, 1, 1,};
        System.out.println("Было " + Arrays.toString(arr0));
        change(arr0);
        System.out.println("Стало" + Arrays.toString(arr0));
    }

    public static void change (int[]array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }
    }
}