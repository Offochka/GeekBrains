package Homework;

/*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/

public class Task04 {
    public static void main(String[] args) {
        int length = 5;
        int[][] arr0 = new int [length][length];
        cube(arr0);
    }

    public static void cube (int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                if ((i == j) || (i == array.length -1 -j)) {
                    array [i][j] = 1;
                }
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
