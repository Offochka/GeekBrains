package Homework;
/*7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
метод должен вывести в консоль сообщение «Привет, указанное_имя!»;*/
public class Task07 {
    public static void main(String[]args){

      System.out.println(name("Маша"));
    }
    public static String name(String с){
        return "Привет," + с;
    }
}
