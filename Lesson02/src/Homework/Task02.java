package Homework;
import java.util.Arrays;
/*2. Задать пустой целочисленный массив размером 8. С помощью цикла
 заполнить его значениями 0 3 6 9 12 15 18 21;*/
public class Task02 {
    public static void main (String[] args) {
        int [] arr0 = new int[8];
        change(arr0);
        System.out.println("Результат " + Arrays.toString(arr0));
    }

    public static void change (int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 3;
        }
    }
}
