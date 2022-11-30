package io.hexlet;

public class App0202 {
    public static void main(String[] args) {
        int[] numbers1 = {};
        int[] numbers2 = {3};
        int[] numbers3 = {5, 6, 7, 8};
        int[] numbers4 = {1, 2, 3, 4, 5};
//        int i;
        int[] numbers = numbers1;
//        App0202.swap(numbers);
        System.out.println(numbers);
        int[] ints = numbers;
        App0202.swap(ints);
    }

    public static int swap(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            return i;
        }return 0;
    }
}