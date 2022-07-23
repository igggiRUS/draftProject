package java224.hw05ifElse;

/**
 * Задание 6
 * Вывести на консоль все восьмизначные числа, цифры в
 * которых не повторяются. Эти числа должны делиться на
 * 12345, без остатка. Показать общее количество найденных
 * чисел.
 */
public class Task06 {
    public static void main(String[] args) {

        int count = 10_000_000;
        int cap = 99_999_999;
        int j = 0;
        for (int i = count; i < cap; i++) {
            String s = String.valueOf(i);
//            код индуса(( но как сделать компактно я не знаю
            if (s.charAt(0) != s.charAt(1) && s.charAt(0) != s.charAt(2) && s.charAt(0) != s.charAt(3) && s.charAt(0) != s.charAt(4) && s.charAt(0) != s.charAt(5) && s.charAt(0) != s.charAt(6) && s.charAt(0) != s.charAt(7) && s.charAt(1) != s.charAt(2) && s.charAt(1) != s.charAt(3) && s.charAt(1) != s.charAt(4) && s.charAt(1) != s.charAt(5) && s.charAt(1) != s.charAt(6) && s.charAt(1) != s.charAt(7) && s.charAt(2) != s.charAt(3) && s.charAt(2) != s.charAt(4) && s.charAt(2) != s.charAt(5) && s.charAt(2) != s.charAt(6) && s.charAt(2) != s.charAt(7) && s.charAt(3) != s.charAt(4) && s.charAt(3) != s.charAt(5) && s.charAt(3) != s.charAt(6) && s.charAt(3) != s.charAt(7) && s.charAt(4) != s.charAt(5) && s.charAt(4) != s.charAt(6) && s.charAt(4) != s.charAt(7) && s.charAt(5) != s.charAt(6) && s.charAt(5) != s.charAt(7) && s.charAt(6) != s.charAt(7)) {
                if (i % 12345 == 0) {
                    j++;
                    System.out.println(i);
                }
            }

        }

        System.out.println("Общее колличество " + j);
    }

}

