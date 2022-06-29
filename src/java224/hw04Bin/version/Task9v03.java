package java224.hw04Bin.version;

/**
 * Задание 9
 * Определить имеют ли чисел M и N разные знаки.
 * Используя только побитовые и условные операторы.
 */
public class Task9v03 {
    public static void main(String[] args) {

        int flags1 = 1;
        int flags2 = 1;
        System.out.print("ИТОГ: ");
        String result = (Integer.toBinaryString(((flags1 & (1 << 31)) >>> 31) ^ ((flags2 & (1 << 31)) >>> 31)));
int resultInt= Integer.parseInt(result, 10);
        System.out.print("Числа имеют ");
        System.out.print(resultInt == 0 ? "одинаковые" : "разные");
        System.out.println(" знаки.");
//        System.out.println((      ) == 0 ? "разные" : "одинаковые");

        System.out.println(Integer.toBinaryString(((flags1 & (1 << 31)) >>> 31) ^ ((flags2 & (1 << 31)) >>> 31)));




    }
}