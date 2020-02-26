package Homework;

import java.util.Random;
import java.util.Scanner;

/*1. Написать программу, которая загадывает случайное число от 0 до 9,
 и пользователю дается 3 попытки угадать это число. При каждой попытке
 компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
 или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
 1 – да / 0 – нет»(1 – повторить, 0 – нет). */
public class Task01 {

    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static int randNumber;
    private static int numHuman;
    private static int numTry = 3;
    private static int max = 9;
    private static int min = 0;

    //загадываем число из массива
    private static int randomNumber (int [] array) {
        int randomIndex = RANDOM.nextInt(array.length);
        return randNumber = array [randomIndex];
    }

    // выводим сообщение и даем ввод числа игроку
    private static int numberHuman (){
        System.out.println( "Угадайте число от 0 до 9:" );
        return numHuman = SCANNER.nextInt();
    }

    //чек числа
    private  static boolean check ( ) {
        if (max < numHuman || min > numHuman) {
            System.out.println("Вы ввели не верное число!");
            return false;
        }
        if (randNumber == numHuman) {
            System.out.println("Вы выиграли!");
            return true;
        }
        if (numHuman < randNumber) {
            System.out.println("Ваше число меньше числа компьютера!");
            return false;
        }
        if (numHuman > randNumber) {
            System.out.println("Ваше число больше числа компьютера!");
        }
        return false;
    }

    //повтор попытки
    //начать игру сначала

    public static void main (String[] args) {
      while (true) {
          System.out.println("Привет, давай сыграем в игру.");
            randomNumber(number);
            for (int i = 0; i < numTry; i++) {
                numberHuman();
                boolean resault = check();
                if (resault) {
                    break;
                } else {
                    System.out.println("Попыток осталось " + (numTry - 1 - i));
                }
            }
            System.out.println("Игра окончена!");

            System.out.println("Хотите сыграть еще? 1 – да / 0 – нет");
            if (SCANNER.nextInt() == 0){
                break;
            }
        }
    }
}
