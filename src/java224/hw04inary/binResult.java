package java224.hw04inary;

public class binResult {
    public static void main(String[] args) {
        int num = 0b101;
        String binNum = Integer.toBinaryString(num);
        System.out.printf("%3d -> %32s\n", num, binNum);
        int result = num << 2;
        String binResul = Integer.toBinaryString(result);
        System.out.printf("%3d -> %32s\n", num, binResul);
    }
}
