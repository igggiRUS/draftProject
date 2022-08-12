package java224.hw06ifElse;

public class Task0502 {
    public static void main(String[] args) {

        int size = 7;
//      Создание пустоты первой стоки
        for (int j = 1; j < size; j++) {
            System.out.print("  ");
        }
//        Верхняя стенка
        for (int j = 1; j <= size; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        // квадрат
        //            пустота треугольника
        for (int f = 0; f < size; f++) {
            for (int d = 0; d <= f; d++)
                System.out.print(f + " ");
                    }
        System.out.println();
            for (int i = 1; i <= size - 2; i++) {
                System.out.print("b ");
                for (int j = 2; j <= size - 1; j++) {
                    System.out.print("  ");
                }
                System.out.print("c ");
                System.out.println();
            }
//        нижняя стенка
            for (int j = 1; j <= size; j++) {
                System.out.print("f ");
            }
        }
    }
