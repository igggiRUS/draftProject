package io.hexlet;

import java.util.Scanner;

public class App270003 {
    public static void main(String[] args) {
        String expectedStr = "Михаилd";
//                              ф в п о д
        Scanner sc = new Scanner(expectedStr);
        String str = sc.nextLine();
        sc.close();
//        определяем количество символов в строке
        System.out.println();
        String result = "";
        for (int i = 1; (i) < str.length(); i++) {
            result = result + (str.charAt(i++))+(str.charAt(i));
        }
        System.out.println(result);
    }
}