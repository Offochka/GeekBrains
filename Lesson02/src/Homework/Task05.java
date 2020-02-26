package Homework;
/* ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
 (без помощи интернета);*/
public class Task05 {
    public static void main(String[] args) {
        int[] arr1 = {1, -23, 89, 456, -97, 0, 50};
        System.out.println("Минимальное число: " + min(arr1));
        System.out.println("Максимальное число: " + max(arr1));
    }

    public static int min(int[] arr0) {
        int minc = arr0[0];

        for (int i : arr0) {
            if (i < minc) {
                minc = i;
            }
        }return minc;
    }

    public static int max(int[] arr0) {
        int maxc = arr0[0];
        for (int i : arr0) {
            if (i > maxc) {
                maxc = i;
            }
        } return maxc;
    }
}


