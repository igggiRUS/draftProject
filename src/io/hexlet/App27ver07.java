package io.hexlet;

import java.util.Scanner;

public class App27ver07 {
    public static void main(String[] args) {

        String expectedStr = "Миx";
        Scanner sc = new Scanner(expectedStr);
        String str = sc.nextLine();
        sc.close();
        System.out.println();
//        String result = null;
//        System.out.println(str.length());
        String pair = null;
        String stringEnd = null;
        for (int i = 0; i < str.length(); i += 2) {

            String result = (str.charAt(++i)) + "" + (str.charAt(--i));
            System.out.println(result);

        }

    }
}
//}