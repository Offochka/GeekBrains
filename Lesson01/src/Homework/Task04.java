package Homework;
/*4. Написать метод, принимающий на вход два числа, и проверяющий
что их сумма лежит в пределах от 10 до 20(включительно), если да –
вернуть true, в противном случае – false;*/
public class Task04 {
    public static void main (String[]args){
        boolean result = Check (15,1);

        System.out.println(result);
    }
    public static boolean Check (int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20){
            return true;
        }else{
            return false;
        }
    }
}
