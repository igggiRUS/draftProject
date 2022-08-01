package java224.hw05ifElse;

/**
 * Задание 9
 * Если перечислить все натуральные числа меньше 10, крат-
 * ные 3 или 5, мы получаем 3, 5, 6 и 9. Сумма этих кратных – 23.
 * Найдите сумму всех чисел, кратных 3 или 5, начиная с 0
 * и до 1 000.
 */
public class Task10 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                count += i;
            }
        }
        System.out.println("Сумма всех чисел c 1000 включительно " + count);
    }
}