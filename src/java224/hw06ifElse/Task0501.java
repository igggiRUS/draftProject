package java224.hw06ifElse;

public class Task0501 {
    public static void main(String[] args) {

        int size = 5;
//        for (int f = 0; f < size; f++) {
//            for (int k = 0; k + 1 < f + 1; k++) {
//                System.out.println("*");
//                код на пустой квадрат
//
//        Верхняя стенка
        for (int j = 1; j <= size; j++) {
            System.out.print("a ");
        }
        // квадрат
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

//        System.out.println();
    }
}