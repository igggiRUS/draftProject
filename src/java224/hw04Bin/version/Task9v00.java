package java224.hw04Bin.version;

/**
 * Задание 9
 * Определить имеют ли чисел M и N разные знаки. Исполь-
 * зуя только побитовые и условные операторы.
 */
public class Task9v00 {
    public static void main(String[] args) {

//        int flags1 = -1;
        int flags1 = -51;
//        int flags2 =  0;
        int flags2 = 14;
        int mask1 = 1;
//        int mask2 = 1;
        int n = 31;
        int z = (mask1 << n);
        int result1 = flags1 & z;
        int result2 = flags2 & z;
        int result3 = (flags1 & z) | (flags2 & z);
        System.out.println(Integer.toBinaryString(result3));
        System.out.printf("\n%32s <<<<<< Число на входе 1" +
                        "\n%32s <<<<<< Проверочное число" +
                        "\n%32s <<<<<< Результат 1",
                (Integer.toBinaryString(flags1)),
                (Integer.toBinaryString(z)),
                (Integer.toBinaryString(result1)));

        System.out.printf("\n\n%32s <<<<<< Число на входе 2" +
                        "\n%32s <<<<<< Проверочное число" +
                        "\n%32s <<<<<< Результат 2",
                (Integer.toBinaryString(flags2)),
                (Integer.toBinaryString(z)),
                (Integer.toBinaryString(result2)));
//        System.out.print("\nОба числа имеют ");
//        System.out.println(result1 != result2 ? "разные знаки" : "одинаковые знаки");




    }
}