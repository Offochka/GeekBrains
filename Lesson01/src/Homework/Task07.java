package Homework;
/*7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
метод должен вывести в консоль сообщение «Привет, указанное_имя!»;*/
public class Task07 {
    public static void main(String[]args){

        name("Маша");
    }
    public static void name(String с){
        System.out.println("Привет," + с);
    }
}
