package io.hexlet;

import java.util.Scanner;

public class App270001 {
    public static void main(String[] args) {
        String expectedStr = "qwertyuiop";
        Scanner sc = new Scanner(expectedStr);
        String str = sc.nextLine();
        sc.close();
//        определяем количество символов в строке
        int symbols = ((str.length()) - (str.length() % 2));


        for (int i = 0; i <= symbols; i++) {
            for (int j = 0; j < i; ++j)
//                System.out.print(str.charAt(++j));
                System.out.print(str.charAt(i));

        }

//        firstLetter = str.substring(j, j + 1);
//        secoundLetter = str.substring(j + 1, j + 2);
//        result = result + secoundLetter + firstLetter;
//        return sesult;
        }
    }



