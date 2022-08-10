package java224.hw06ifElse;

/**
 * Задание 4
 * Ромб: Пустой.
 */
public class Task0402 {
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
            for (int j = 1; j <= i * 2 - 1; j++) {
//                внутренности треугольника наполнение верха
                System.out.print("  ");
            }
            //             правая стенка треугольника
            System.out.print("* \n");
        }

//    :::::::::::::::::::::::::::::::::::::::::::::::

        System.out.print("* ");
//      Создание пустоты первой стоки  (центр ромба)
        for (int j = 2; j < size*2-1; j++) {
            System.out.print("  ");
        }
//        первый символ первой строки (центр ромба последний символ)
        System.out.print("* \n");

//    :::::::::::::::::::::::::::::::::::::::::::::::
//    Нижняя половина ромба
//    Пустота с лева
        for (int i = 1; i < size - 1; i++) {
            for (int f = 0; f < i; f++) {
                System.out.print("  ");
            }
//            Уменьшение size на величину пустоты
            System.out.print("* ");
            for (int j = 2; j < (size - i)*2-1; j++) {
//                    заполнение низа
                System.out.print("  ");
            }
            System.out.println("*  ");
        }
//        Пустота последней строки
        for (int k = 1; k < size; k++) {
            System.out.print("  ");
        }
        System.out.print("*  ");
    }
}
