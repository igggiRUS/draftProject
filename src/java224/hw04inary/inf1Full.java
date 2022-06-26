package java224.hw04inary;

import java.util.Scanner;

public class inf1Full {
    public static void main(String[] args) {
        System.out.println("Введите двоичное число через пробел 2147483647 5634564");
//      максимально возможное число  2147483647
//      String srtBin = "65534 1";
//      Scanner sc = new Scanner(srtBin);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println("число из двоичного кода А: " + Integer.parseInt(Integer.toUnsignedString(a)));
        System.out.println("число из двоичного кода B: " + Integer.parseInt(Integer.toUnsignedString(b)));
        System.out.println();

        int zeroBit = 32;
        String str = "0";

        System.out.println("Бинарное число А:        " + str.repeat((zeroBit - (Integer.toBinaryString(a)).length())) + "" + Integer.toBinaryString(a));
        System.out.println("Бинарное число Б:        " + str.repeat((zeroBit - (Integer.toBinaryString(b)).length())) + "" + Integer.toBinaryString(b));
        System.out.println("\n");
        int resultAnd = a & b;
        int resultOr = a | b;
        System.out.println("Результат побитовго И:   " + str.repeat((zeroBit - (Integer.toBinaryString(resultAnd)).length())) + "" + Integer.toBinaryString(resultAnd));
        System.out.println("Результат побитовго ИЛИ: " + str.repeat((zeroBit - (Integer.toBinaryString(resultOr)).length())) + "" + Integer.toBinaryString(resultOr));
    }
}
