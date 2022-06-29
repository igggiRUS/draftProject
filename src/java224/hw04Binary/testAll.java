package java224.hw04Binary;

public class testAll {
    public static void main(String[] args) {
        System.out.println("1 ^ 1 = " + (1 ^ 1));
        System.out.println("0 ^ 0 = " + (0 ^ 0));
        System.out.println("1 ^ 0 = " + (1 ^ 0));
        System.out.println("0 ^ 1 = " + (0 ^ 1));
        System.out.println("1 | 1 = " + (1 | 1));
        System.out.println("0 | 0 = " + (0 | 0));
        System.out.println("1 | 0 = " + (1 | 0));
        System.out.println("0 | 1 = " + (0 | 1));
        
        int a = 0b11111111_11111111_11111111_10101010;
        int b = 0b00000000_00000000_00000000_11111111;
        System.out.println("a ^ a = " + Integer.toBinaryString((a ^ a)));
        System.out.println("b ^ b = " + Integer.toBinaryString((b ^ b)));
        System.out.println("a ^ b = " + Integer.toBinaryString((a ^ b)));
        System.out.println("b ^ a = " + Integer.toBinaryString((b ^ a)));
        System.out.println("a | a = " + Integer.toBinaryString((a | a)));
        System.out.println("b | b = " + Integer.toBinaryString((b | b)));
        System.out.println("a | b = " + Integer.toBinaryString((a | b)));
        System.out.println("b | a = " + Integer.toBinaryString((b | a)));
        
    }
}
