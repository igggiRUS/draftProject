package io.hexlet.shablon;

public class App2022 {
    private static int[] numbers;

    public static void main(String[] args) {
        int[] numbers0 = {};
        int[] numbers1 = {1};
        int[] numbers2 = {1, 2};
        int[] numbers3 = {1, 2, 3};
        int[] numbers4 = {1, 2, 3, 4};
        int[] numbers5 = {1, 2, 3, 4, 5};
        App2022.swap(numbers1);

    }

    public static int[] swap(int[] numbers) {
        int length = numbers.length;

        if (length < 2) {
            return numbers;
        }
        int lastIndex = numbers.length - 1;
        int firstIndex = numbers[lastIndex];
        numbers[lastIndex] = numbers[0];
        numbers[0] = firstIndex;
        return numbers;
    }
}