package io.hexlet;
//for (int numbers:array)
public class App2021 {
    private static int[] numbers;

    public static void main(String[] args) {
        int[] numbers0 = {};
        int[] numbers1 = {1};
        int[] numbers2 = {1, 2};
        int[] numbers3 = {1, 2, 3};
        int[] numbers4 = {1, 2, 3, 4};
        int[] numbers5 = {1, 2, 3, 4, 5};
        App2021.swap(numbers2);

    }

    public static int[] swap(int[] numbers) {
//        int i = 0;
        if (numbers.length <= 1) {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        } else {
            int last = numbers.length-1;
            System.out.println(last);
            int first = numbers[0];
            numbers[0] = numbers[last];
            numbers[last] = first;

        }
        return numbers;
    }

}




