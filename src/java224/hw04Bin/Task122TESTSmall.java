package java224.hw04Bin;

public class Task122TESTSmall {
    public static void main(String[] args) {

        int flags = 5;
        byte mask = 0b1;
        int shift0 = 0**2;
        int shift1 = 1**2;
        int shift2 = 2**2;
        int shift3 = 2**2;

        int result0 = ((flags & (~shift0)) >>> shift0);
        int result1 = ((flags & (~shift1)) >>> shift1);
        int result2 = ((flags & (~shift2)) >>> shift2);
        int result3 = ((flags & (~shift3)) >>> shift3);
        System.out.println("сдвиг бита в лево #######Верно");
        System.out.println(Integer.toBinaryString(~shift0));
        System.out.println(Integer.toBinaryString(~shift1));
        System.out.println(Integer.toBinaryString(~shift2));
        System.out.println(Integer.toBinaryString(~shift3));
        System.out.println("Сдвиг в право что бы убрать нули до старшего разряда");
        System.out.println(Integer.toBinaryString((flags & ~shift0) >>> shift0));
        System.out.println(Integer.toBinaryString((flags & ~shift1) >>> shift1));
        System.out.println(Integer.toBinaryString((flags & ~shift2) >>> shift2));
        System.out.println(Integer.toBinaryString((flags & ~shift3) >>> shift3));
        System.out.println("#######################");
        System.out.println(Integer.toBinaryString(result0));
        System.out.println(Integer.toBinaryString(result1));
        System.out.println(Integer.toBinaryString(result2));
        System.out.println(Integer.toBinaryString(result3));
        System.out.println("СУММА#######################");
        int result = result0 + result1 + result2 +result2;
        System.out.println("ИТОГ#######################");
        System.out.printf("В двоичном числе %s" +
                "\n %d флагов (нулей) ", Integer.toBinaryString(flags), result);

    }
}