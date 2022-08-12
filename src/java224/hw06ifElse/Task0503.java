package java224.hw06ifElse;

public class Task0503 {
    public static void main(String[] args) {
        int size = 7;
//            пустота треугольника
        for (int i = 0; i < size; i++) {
            System.out.print("  ");
        }
        for (int j = 1; j < size * 2; j++) {
            System.out.print("* ");
        }
        System.out.println();
//        треугольгик в низ
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                System.out.print("  ");
            }
//            пустота треугольника
            System.out.println("* ");
            System.out.println();}

        for (int i = 0; i < size * 2; i++) {
            System.out.print("* ");
        }
    }
}
