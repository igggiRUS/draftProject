package io.hexlet;

import java.util.Scanner;

public class App270002 {
    public static void main(String[] args) {
        String expectedStr = "фывапролдж";
//                              ф в п о д
        Scanner sc = new Scanner(expectedStr);
        String str = sc.nextLine();
        sc.close();
//        определяем количество символов в строке
        System.out.println();
        int symbols = ((str.length()) - (str.length() % 2));
        for (int i = 0; i <= symbols; i++) {
            System.out.print((i % 2 == 0 ? str.charAt(i++) : str.charAt(i)));
            }

            // END
        }
    }


