package java224.hw05ifElse;
/**
 * Задание 5
 * Напишите программу, которая будет проверять, является
 * ли число, введенное с клавиатуры палиндромом (одинаково
 * читающееся в обоих направлениях). Например, 123454321
 * или 221122 – палиндром. Программа должна вывести YES,
 * если число является палиндромом, и NO – в противополож-
 * ном случае.
 */

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner cs = new Scanner(System.in);
        int num = cs.nextInt();
        String number = Integer.toString(num);
        System.out.println(number);
        String reverse = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reverse += number.charAt(i);
//            System.out.println(reverse);
        }
        boolean palindrome = true;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
