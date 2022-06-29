package java224.hw04Binary;


import java.util.Scanner;

/**
 * Проверить какой день занят
 */
public class day2 {
    public static void main(String[] args) {
        String str = "5";
        Scanner sc = new Scanner(str);
        String day = sc.nextLine();
        sc.close();
        int num = 172;
        int result = num & (1 << 2);
        String binResult = Integer.toBinaryString(result);
        System.out.printf("%3d > %32s\n", result, binResult);

    }
}
