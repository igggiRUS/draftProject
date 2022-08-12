package java224.hw06ifElse;

public class Test003 {
    public static void main(String[] args) {
        int size = 10;
        for (int j = 1; j <= size; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int l = 1; l <= size - 2; l++) {
            System.out.print("*");
            for (int r = 2; r <= size - 1; r++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int j = 1; j <= size; j++) {
            System.out.print("*");
        }
    }
}
