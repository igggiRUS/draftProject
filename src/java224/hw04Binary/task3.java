package java224.hw04Binary;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

    /**
     * Установить i-й бит числа N равным 1. Вывести результат на консоль в двоичном виде.
     *
     */
        System.out.println("Введите цифру в десятичной системе: ");
        String str = "1";
        Scanner scanner = new Scanner(str);
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирите бит числа для установки цифры 1 : 10101 ");
        int numBin = scanner.nextInt();
        int n = 0b01001110101;
        System.out.printf("Цифра в двоичной системе: %s\n", (Integer.toBinaryString(numBin)));

        int zeroBit = 32;
        String strZero = "0";

        String pluse = strZero.repeat((zeroBit - (Integer.toBinaryString(numBin)).length())) + "" + Integer.toBinaryString(numBin);
        System.out.printf("Вы выбрали число: %32s\n",  pluse);
        int result = n | (1 << numBin);
        System.out.printf("%d -> %s\n", result, Integer.toBinaryString(result));
    }
}

