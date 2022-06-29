package java224.hw04Binary;

/**
 * Обнулениче правой части ROX
 */

public class task10 {
    public static void main(String[] args) {
        int a = 0b11111111_11111111_11111111_10101010;
        int b = 0b00000000_00000000_00000000_11111111;


        int resultRox = a & b;
        System.out.printf("%32s\n", Integer.toBinaryString(a));
        System.out.printf("%32s\n", Integer.toBinaryString(b));
        System.out.printf("%32s\n", Integer.toBinaryString(resultRox));

    }
}
