package java224.hw05ifElse;

public class Test03003 {
    public static void main(String[] args) {
        int summPow = 0;
        int numberCap = 153;
        int number = numberCap;
        for (int j = 1; j < numberCap; j++) {
//            number = numberCap;
            for (int i = 0; i < number; i++) {
                summPow += (int) Math.pow(number % 10, 3);
                // Число деленное на МОДуль возведенное в 3 степень суммируется с остальными числами в строке
//                System.out.println(summPow);
                number /= 10;
                if (number == 0) {
//                Сравнение числа и суммы чисел возвденных в 3 степень
                    if (numberCap == summPow) {
                        System.out.println("Самовлюблённое число или число Армстронга " + summPow);
                    }
                }
            }
        }
    }
}


// Узнал колличество символов
// String aString = Integer.toString(number);
// int lengthNum = aString.length();
// System.out.println("колличество символов" + lengthNum);