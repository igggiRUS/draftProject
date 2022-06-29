package java224.hw04Binary;

import java.util.Scanner;

public class task4invert {
    public static void main(String[] args) {
        System.out.println("Введите десятичное число например 2147483647 оно является максимальным числом после него идет переполнение.");
//        String для примера что бы постоянно не вводить числа руками
        System.out.println("Введите число: ");
        String srtBin = "2147483647";
//                String srtBin = "12312312";
//        Scanner sc = new Scanner(srtBin);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
//        System.out.printf("Вы ввели число %d\n", a);
        int zeroBit = 32;
        String strZero = "0";
        String pluse = strZero.repeat((zeroBit - (Integer.toBinaryString(a)).length())) + "" + Integer.toBinaryString(a);
        String minus = strZero.repeat((zeroBit - (Integer.toBinaryString(~a)).length())) + "" + Integer.toBinaryString(~a);

        System.out.printf("НЕ инвертированное число: %32s\n",  pluse);
        System.out.printf("Инвертированное число: %35s\n",  minus);

//        System.out.println(pluse.length());
//        System.out.println(minus.length());

    }
}
