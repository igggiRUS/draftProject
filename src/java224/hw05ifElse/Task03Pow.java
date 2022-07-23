package java224.hw05ifElse;

import java.util.Scanner;

public class Task03Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number =");
        double number = sc.nextDouble();
        int power = sc.nextInt();
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        sc.close();
        System.out.println(result);
    }
}
