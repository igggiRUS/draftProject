package Alishev;

public class App011 {
    public static void main(String[] args) {
//        [array] -> ссылка (ссылочный тип данных)
        int[] numbers = new int[5]; // каждое значение является объектом или весь массив объект?
//        инициализация массива
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        int[] custom = {1, 2, 3, 4, 5}; // здесь нет объектов?
        for (int i = 0; i < custom.length; i++) {
            System.out.println(custom[i]);
        }

    }
}
