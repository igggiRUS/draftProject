package io.hexlet;

import java.util.Scanner;

public class App26DontDELETE {
    public static int main(String[] args) {
        String str = "5 64";
        Scanner sc = new Scanner(str);
        int start = sc.nextInt();
        int finish = sc.nextInt();
        sc.close();

        while (start < finish) {

            int i = 1;
            start = start + i;
            System.out.println(start);
//            String zero;
//            return (zero = start + "");

        }
        return (start);
    }
}
