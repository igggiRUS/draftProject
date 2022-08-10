package java224.hw05ifElse;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Сколько километров пробежал в первый день");
        double x = sc.nextDouble();
        System.out.println("Сколько километров должен пробегать");
        double y = sc.nextDouble();
        double i = 1;
        while (x <= y) {
            x = x / 100 * 10 + x ; // x * 1.1 или x * 0.1
            i++;
            System.out.println(i);
        }
    }
}