package java224.hw04Binary;


/**
 * Проверить какой день занят
 */
public class day1 {
    public static void main(String[] args) {
        int num = 5000;
//        операция сдвига это умножение числа на 2 или 2(в степени)
        int lefr2 = 1 << 30;
        System.out.println("Число в десятичном виде: " + lefr2);
        System.out.println("Число в двоичном виде: " + Integer.toUnsignedString(lefr2, 2));
        int lefr = ~(1 << 31);
        int result = num & lefr;
        System.out.println("Число в десятичном виде: " + lefr);
        System.out.println("Число в двоичном виде: " + Integer.toUnsignedString(lefr, 2));
//        System.out.println(Integer.parseUnsignedInt(String.valueOf(lefr), 2));
        String binResult = Integer.toBinaryString(result);
        String binNum = Integer.toBinaryString(num);
        System.out.printf("%3d > %32s\n", result, binResult);
        System.out.printf("%3d > %32s\n", result, binNum);

    }
}
