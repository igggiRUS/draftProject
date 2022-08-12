package java224.hw06ifElse;

/**
 * Задание 4
 * Ромб: заполненный.
 */
public class Task040101 {
    public static void main(String[] args) {
        final int size = 7;
//      Создание пустоты первой стоки
        for (int j = 1; j < size; j++) {
            System.out.print(j + " ");
        }
//        первый символ первой строки
        System.out.print(size + " \n");
//        воздух с лева
        for (int i = 1; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                System.out.print(j + " ");
            }
//            стенка треугольника
            System.out.print(size + " ");
            for (int j = 1; j <= i * 2 - 1; j++) {
//                внутренности треугольника наполнение верха
                System.out.print(i + " ");
            }
            //             правая стенка треугольника
            System.out.print(size +" \n");
        }

        //            :::::::::::::::::::::::::::::::::::::::::::::::

        System.out.print(size + " ");
//      Создание пустоты первой стоки  (центр ромба)
        for (int j = 2; j < size * 2 - 1; j++) {
            System.out.print(j+ " ");
        }
//        первый символ первой строки (центр ромба последний символ)
        System.out.print(size +" \n");

//            :::::::::::::::::::::::::::::::::::::::::::::::
        // Нижняя половина ромба
        //        Пустота с лева
        for (int i = 1; i < size - 1; i++) {
            for (int f = 0; f < i; f++) {
                System.out.print(f +" ");
            }
//            Уменьшение size на величину пустоты
            System.out.print(size + " ");
            for (int j = 2; j < (size - i) * 2 - 1; j++) {
//                    заполнение низа
                System.out.print(j + " ");
            }
            System.out.println(size + " ");
        }
//        Пустота последней строки
        for (int k = 1; k < size; k++) {
            System.out.print(k + " ");
        }
        System.out.println(size + " ");
    }
}
