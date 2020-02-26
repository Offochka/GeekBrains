package Homework;

import java.util.Arrays;

/*7. **** Написать метод, которому на вход подается одномерный массив и число n
(может быть положительным, или отрицательным), при этом метод должен сместить все
элементымассива на n позиций. Для усложнения задачи нельзя пользоваться
 массивами.*/
public class Task07 {
    public static void main(String[] args) {
        int [] arr1 = {1, 5 ,-15, 36, 17};
        int n = 3;

        System.out.println("БЫЛО : " + (Arrays.toString(arr1)));
        change(arr1,n);
        System.out.println("СТАЛО: " + (Arrays.toString(arr1)) + " , где n = " + n);

    }
    public static void change (int [] array, int b){

        if (b < 0) {
            for (int i = 0; i < b * (-1) ; i++) {
                int left = array [0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length-1] = left;
            }
        } else if (b > 0){
            for (int i = 0; i < b; i++) {
                int right = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array [j] = array[j - 1];
                }
                array[0] = right;
            }
        }
    }
}

