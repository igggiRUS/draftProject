package java224.hw05ifElse;

public class Test03001 {
    public static void main(String[] args) {
        int number = 3515;
//        int pow = 0;
        int pow1 = 0;
//        цикл булеан работает пока число есть
//        for (int i = 0; true; i++) {
        for (int i = 1; i < number; i++) {
//        делим на модуль 10 и полученное значение возводим в степень 3
            int pow = (int) Math.pow((number % 10), 3);
//            int pow1 += pow;
            System.out.println(pow1);

//        делим число  на 10 что бы отсечь дробную часть int  отсекает дробь
            number /= 10;
            if (number == 0) {
//break;
            }
        }
        int pow2 = (int) Math.pow((number % 10), 3);
        System.out.println(pow2);
    }
}

// Узнал колличество символов
// String aString = Integer.toString(number);
// int lengthNum = aString.length();
// System.out.println("колличество символов" + lengthNum);