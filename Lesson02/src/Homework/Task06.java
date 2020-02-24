package Homework;
/*6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
 метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
 части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
  checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы
  в массив не входят.*/
public class Task06 {
    public static void main(String[] args) {
    int [] arrTrue = {1, 2, 1, 1, 1};
    int [] arrFalse = {23, 45, 55, 16, 12};

    System.out.println(checkBalance(arrTrue));
    System.out.println(checkBalance(arrFalse));

    }
    public static boolean checkBalance (int [] array){
        int sumRight = 0;
        int sumLeft = 0;

        for (int i = 0; i < array.length; i++) {
            sumRight = sumRight + array[i];
        }

        for (int j = 0; j < array.length; j++ ) {
            if (sumRight == sumLeft){
                return true;
            }else {
                sumLeft = sumLeft + array[j];
                sumRight = sumRight - array [j];
            }
        } return false;
    }
}

