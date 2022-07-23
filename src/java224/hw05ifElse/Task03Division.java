package java224.hw05ifElse;

/**
 * Самовлюблённое число или число Армстронга – натуральное число, которое равно сумме своих цифр, возведенных
 * в степень, равную количеству его цифр.
 * Показать на экране все числа Армстронга в диапазоне от 10 до 1 000 000.
 * Например:
 * 153 = 1 ** 3 + 5 ** 3 + 3 ** 3
 */
public class Task03Division {
    public static void main(String[] args) {
        int number = 1503;

        for (int i = 0; true; i++) {
            System.out.println(number % 10);
            number /= 10;
            if (number == 0) {
                break;
            }
        }

//        System.out.println(Integer.toString(x));

    }
}

