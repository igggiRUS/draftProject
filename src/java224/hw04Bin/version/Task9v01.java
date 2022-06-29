package java224.hw04Bin.version;

/**
 * Задание 9
 * Определить имеют ли чисел M и N разные знаки. Исполь-
 * зуя только побитовые и условные операторы.
 */
public class Task9v01 {
    public static void main(String[] args) {

        int flags1 = -1;
        int flags2 = 1;
        System.out.print("ИТОГ: ");
        System.out.println(Integer.toBinaryString((flags1 & (1 << 31)) ^ (flags2 & (1 << 31))));
        System.out.println(Integer.toBinaryString((flags1 & (1 << 31))));
        System.out.println(Integer.toBinaryString((flags2 & (1 << 31))));



    }
}