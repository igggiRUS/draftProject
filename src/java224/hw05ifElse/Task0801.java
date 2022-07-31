package java224.hw05ifElse;

/**
 * Задание 8
 * Электронные часы показывают время в формате от 00:00 до 23:59. Написать программу, которая выведет на консоль
 * сколько раз за сутки случается так, что слева от двоеточия
 * показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51). Вывести
 * на экран все симметричные комбинации. Вывести общее
 * число комбинаций.
 */

public class Task0801 {
    public static void main(String[] args) {
        int hour = 0;
        int minute = 0;
        int hourTime = 24;
        int minuteTime = 60;



        String hourStr = Integer.toString(hour);
        int hourCharAt = hourStr.length();
        System.out.println("index " + hourCharAt);
        String minuteStr = Integer.toString(minute);
        int minteCharAt = minuteStr.length();
        System.out.println("index " + minteCharAt);
        if (minteCharAt == 1 && hourCharAt == 1) {
            hourStr = "0" + hourStr;
            minuteStr = "0" + minuteStr;
            System.out.println(hourStr);
            System.out.println(minuteStr);
        }
    }
}
//Надо взять цифру из счетчика привязать к ней ноль и сравнить два стринга!!!!!! в зеркале палидром
//        String reverse = "";
//        for (int i = hour.length() - 1; i >= 0; i--) {
//            reverse += number.charAt(i);
////            System.out.println(reverse);
//        }
//        boolean palindrome = true;
//        for (int i = 0; i < number.length(); i++) {
//            if (number.charAt(i) != reverse.charAt(i)) {
//                palindrome = false;
//            }
//        }
//        if (palindrome) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}
