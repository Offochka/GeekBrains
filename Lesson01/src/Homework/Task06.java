package Homework;
/*6. Написать метод, которому в качестве параметра передается целое число,
 метод должен вернуть true, если число отрицательное;*/
public class Task06 {
    public static void main(String[] args) {
        boolean result =  CheckNumber(9);

        System.out.println(result);
    }
    public static boolean CheckNumber (int a){
        return (a < 0);
    }
}
