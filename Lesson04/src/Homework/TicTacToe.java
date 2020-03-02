package Homework;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DEFAULT = '_';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static int Size;
    private static int dotWin;

    private static char[][] map;

    // выбор размера поля
    private static int sizeMap(){
        System.out.println("Введите размер поля для крестиков-ноликов.");
        Size = SCANNER.nextInt();
        return Size;
    }
    //обозначаем сколько необходимо собрать вряд символов для победы
    private static int symWin(){
        dotWin = (Size == 3)? 3 : 4;
        return dotWin;
    }
    // обозначаем поле и проставляем его символом
    private static void initMap() {
        map = new char[Size][Size];
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                map[i][j] = DEFAULT;
            }
        }
    }
    // печатаем поле
    private static void printMap() {
        System.out.print("   ");
        for (int i = 0; i < Size; i++) {
            System.out.print((i+1)+" ");
        }
        System.out.println();

        for (int i = 0; i < Size; i++) {
            System.out.print((i+1)+" ");
            for (int j = 0; j < Size; j++) {
                System.out.print("|" + map[j][i]);
            }
            System.out.println("|");
        }
    }
    // ход игрока
    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.print("Выберете координаты (x y) от 1 до "+ Size + " >> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y) || !isCellEmpty(x, y));
        map[y][x] = DOT_HUMAN;
    }

    private static boolean isCellValid(int x, int y) {
        return x >= 0 && x < Size && y >= 0 && y < Size;
    }

    private static boolean isCellEmpty(int x, int y) {
        return map[y][x] == DEFAULT;
    }

    // ход pc
    private static void pcTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(Size);
            y = RANDOM.nextInt(Size);
        } while (!isCellEmpty(x, y));
        map[y][x] = DOT_AI;

    }
    // ничья
    private static boolean isDraw() {
        for (int y = 0; y < Size; y++) {
            for (int x = 0; x < Size; x++) {
                if (map[y][x] == DEFAULT) {
                    return false;
                }
            }
        }
        return true;
    }
    // проверка победы
    private static boolean checkWin(char [][] map, char c) {
        for (int i = 0; i < Size; i++) {
            for (int j = 0; j < Size; j++) {
                if (checkLine(map,c,i,j,0, 1)) { // проверка горизонтали
                    return true;
                }
                if (checkLine(map,c,i,j,1, 0)) { //проверка вертикали
                    return true;
                }
                if (checkLine(map,c,i,j,1, 1)) { // проверка диагонали в вверх
                    return true;
                }
                if (checkLine(map,c,i,j,-1, 1)) { // проверка диагонали вниз
                    return true;
                }
            }
        } return false;
    }
    // проверка линии для победы
    private static boolean checkLine (char [][] map, char c , int i, int j, int iStep, int jStep) {
        int charTrue = 0;
        for ( ;i >= 0 && i < Size && j >= 0 && j < Size; j += jStep, i += iStep) {
            if (map[i][j] == c) {
                charTrue++;
                if (charTrue >= dotWin) {
                    return true;
                }
            }else {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) throws InterruptedException {
      while (true) {
        sizeMap();
        symWin();
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(map, DOT_HUMAN)) {
                System.out.println("Вы выиграли!");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничья!");
                break;
            }
            System.out.println("Ход противника");
            for (int i = 0; i < 7; i++) {
                System.out.print("* ");
                Thread.sleep(300);

            }
            System.out.println();
            pcTurn();
            printMap();
            if (checkWin(map, DOT_AI)) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничья!");
                break;
            }
        }
          System.out.println("Хотите сыграть еще? 1 – да / 0 – нет");
          if (SCANNER.nextInt() == 0){
              break;
          }
      }
    }
}