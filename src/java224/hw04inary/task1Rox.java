package java224.hw04inary;

import java.util.Scanner;

/**
 * Обнулить бит в нулевом разряде ROX
 */
public class task1Rox {
    public static void main(String[] args) {
        System.out.println("Введите двоичное число через пробел 1023 0");
//      максимально возможное число  2147483647
        String srtBin = "1023 1";
        Scanner sc = new Scanner(srtBin);
//        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println("число из двоичного кода А: " + Integer.parseInt(Integer.toUnsignedString(a)));
        System.out.println("число из двоичного кода B: " + Integer.parseInt(Integer.toUnsignedString(b)));
        System.out.println();


        int zeroBit = 32;
        String str = "0";

        System.out.println("Бинарное число А: " + str.repeat((zeroBit - (Integer.toBinaryString(a)).length())) + "" + Integer.toBinaryString(a));
        System.out.println("Бинарное число Б: " + str.repeat((zeroBit - (Integer.toBinaryString(b)).length())) + "" + Integer.toBinaryString(b));
        int result = a ^ b; // ROX
        System.out.println("Результат:        " + str.repeat((zeroBit - (Integer.toBinaryString(result)).length())) + "" + Integer.toBinaryString(result));

    }
}
