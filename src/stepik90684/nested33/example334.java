package stepik90684.nested33;

import java.util.Scanner;

/**
 * ООО "Круче Гугла" наняло трёх разработчиков. Внезапно разработчики узнали, что их зарплаты различаются. Разработчики решили объявить забастовку, если разница максимальной и минимальной зарплаты превысит определённый уровень. Определите, грозит ли ООО "Круче Гугла" забастовка.
 *
 * Формат ввода:
 *
 * В первой строке - зарплаты разработчиков через пробел, три целых числа.
 *
 * Во второй строке - разница, при превышении которой будет объявлена забастовка.
 *
 * Формат вывода:
 *
 * "Ура, бастуем!" - если критический уровень превышен;
 *
 * "За работу, Солнце ещё высоко" - если критический уровень не превышен.
 * ######################################################################
 * Sample Input:
 *
 * 300 400 500
 * 100
 * Sample Output:
 *
 * Ура, бастуем!
 */
public class example334 {
    public static void main(String[] args) {
        String string = "300 400 500 100";
        Scanner sc = new Scanner(string);
//        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int diff = sc.nextInt();
        int x;

        if (a > b) {
            x = a;
            a = b;
            b = x;
        }
        if (b > c) {
            x = b;
            b = c;
            c = x;
        }
        if (a > b) {
            x = a;
            a = b;
            b = x;
        }

//        System.out.print(b);
        System.out.println((c - a > diff) ? "Ура, бастуем!" : "За работу, Солнце ещё высоко");
    }
}