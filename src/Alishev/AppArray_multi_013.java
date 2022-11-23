package Alishev;

public class AppArray_multi_013 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[1]);
//        первая номер строки вторая номер столбца в двумерном массиве
        int[][] multi = new int[5][12];
        int[][] matrices = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[i].length; j++) {
                System.out.print(matrices[i][j] + " ");
            }
            System.out.println();

        }
//        System.out.println(matrices[2][2]);
//        System.out.println(matrices[1][0]);
    }
}
