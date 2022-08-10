package java224.hw06ifElse;

/**
 * Задание 4.2.2 пустой
 * Прямоугольный треугольник,
 * прямым углом вверх-вправо:
 * пустой.

 */
public class Task0201 {
    public static void main(String[] args) {
        int size = 7;
//        Счетчик первой строки
        for (int k = 0; k < size; k++) {
            System.out.print("* ");
        }
        System.out.println();
//        Пустота с лева
        for (int i = 1; i < size - 1; i++) {
            for (int f = 0; f < i; f++) {
                System.out.print("  ");
            }
//            Уменьшение size на величину пустоты
            System.out.print("* ");
            for (int j = 2; j < size - i; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
//        Пустота последней строки
        for (int k = 1; k < size; k++) {
            System.out.print("  ");
        }
        System.out.print("*  ");
    }
}
