package java224.hw06ifElse;

/**
 * Задание 4.2.1 заполненный
 * Прямоугольный треугольник,
 * прямым углом вниз-вправо:
 * заполненный.
 */
public class Task0102 {
        public static void main(String[] args) {
            final int size = 7;
//      Создание пустоты первой стоки
            for (int j = 1; j < size; j++) {
                System.out.print("  ");
            }
//        первый символ первой строки
            System.out.print("* \n");
//        воздух с лева
            for (int i = 1; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    System.out.print("  ");
                }
//            стенка треугольника
                System.out.print("* ");
                for (int j = 1; j <= i - 1; j++) {
//                    внутренности треугольника наполнение
                    System.out.print("* ");
                }
//             правая стенка треугольника
                System.out.print("* \n");
            }
//         основание треугольника
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.print('\n');
        }
}