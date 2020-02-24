package Homework;

import java.util.Arrays;

/*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
 и числа меньшие 6 умножить на 2; */

public class Task03 {
    public static void main(String[] args) {
        int [] arr0 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1,};
        System.out.println("Было " + Arrays.toString(arr0));
        change(arr0);
        System.out.println("Стало" + Arrays.toString(arr0));
    }

    public static void change (int[] arr1) {
        for (int i = 0; i<arr1.length; i++) {
            arr1[i] = (arr1 [i] < 6) ? arr1 [i] * 2 : arr1[i];
        }
    }
}
