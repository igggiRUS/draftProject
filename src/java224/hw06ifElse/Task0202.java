package java224.hw06ifElse;

/**
 * Задание 4.2.2 заполненый
 * Прямоугольный треугольник,
 * прямым углом вверх-вправо:
 * заполненный

 */
public class Task0202 {
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
//            заполнение внутренности треугольника
            for (int j = 2; j < size - i; j++) {
                System.out.print("* ");
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
