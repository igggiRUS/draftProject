package Kata.alishev;

//https://www.youtube.com/watch?v=li86TEAEhYM
//Java для начинающих. Урок 11: Массивы в Java.
public class ArrayFor1 {
    public static void main(String[] args) {
        int number = 10; // примитивный тип данных
        char character = 'a'; // примитивный тип данных
        String string = "Hello"; // ссылочный тип данных
        String s1 = new String("Hello"); // объект класса одинаково с верхней строчкой на строке выше сокращенное описание
//        создание массива
        int[] nubmers = new int[5];
//        инициализация массива
        for (int i = 0; i < nubmers.length; i++) {
            nubmers[i] = i * 10;
        }
        for (int i = 0; i < nubmers.length; i++) {
            System.out.println(nubmers[i]);
        }
//        создаем и сразу инициализируем
        int[] number1 = {1, 2, 3};
        for (int i = 0; i < number1[i]; i++) {
            System.out.println(number1[i]);
        }
    }
}
