package java224.hw04Binary;

import java.util.Scanner;

/**
 * Определить есть ли ноль в двоичном числе
 */
public class task12Rox {
    public static void main(String[] args) {
        System.out.println("Определить есть ли ноль в числе");
        System.out.println("Введите десятичное число: ");
        String srtBin = "10";
        Scanner sc = new Scanner(srtBin);
//        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        int numBin = Integer.parseInt(Integer.toBinaryString(a));
        System.out.println(numBin);




    }
}