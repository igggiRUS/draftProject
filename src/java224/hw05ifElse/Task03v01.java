package java224.hw05ifElse;

import java.util.Scanner;

public class Task03v01 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("number =");
        int number = 1245;
        String str = String.valueOf(number);
        int strLenght = str.length();
        int power = 3;
        int result = 1;

        for (int i = 0; true; i++) {
            int n = number % 10;
            number /= 10;
            if (number == 0) {
            }
            for (int j = 0; j < power; j++) {
                result *= n;
            }
return;
            }
//            System.out.println(result);
//            break;
        }
    }

