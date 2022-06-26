package java224.hw04inary;

import java.util.Scanner;

/**
 * возвести в степень n
 */
public class task2sqrt02 {
    public static void main(String[] args) {
        System.out.println("Над форматированием пришлось поработать :)");
        System.out.println("Введите десятичное число: ");
//        String srtBin = "2";
//        Scanner sc = new Scanner(srtBin);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        System.out.printf("Вы ввели десятичное число: %d\n", a);

        int zeroBit = 32;
        String strZero = "0";

        System.out.println("В Двоичном коде : " + strZero.repeat((zeroBit - (Integer.toBinaryString(a)).length())) + "" + Integer.toBinaryString(a));

        // степень числа
        for (int degree = 1; degree < 9; degree++) {
            int z = a << degree;
            System.out.printf(" %8d ** %2d = %32s %25s\n", a, (degree + 1), ((strZero.repeat((zeroBit - (Integer.toBinaryString(z)).length())) + "" + Integer.toBinaryString(z))), "1");
        }
    }
}
}