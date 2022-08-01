//package java224.hw05ifElse;
//
///**
// * Задание 8
// * Электронные часы показывают время в формате от 00:00
// * до 23:59. Написать программу, которая выведет на консоль
// * сколько раз за сутки случается так, что слева от двоеточия
// * показывается симметричная комбинация для той, что спра-
// * ва от двоеточия (например, 02:20, 11:11 или 15:51). Вывести
// * на экран все симметричные комбинации. Вывести общее
// * число комбинаций.
// */
//public class task08001 {
//    public static void main(String[] args) {
//        int clockHour = 00;
//        int clockMinute = 00;
//        int capHour = 24;
//        int capMinute = 60;
////        String strHour = "";
//
//
//        for (int i = 0; i <= capHour; i++) {
//            if (i < 10) {
//                String strHour = ('0' + Integer.toString(i));
//                System.out.println(strHour);
//            } if (i > 10) {
//                String strHour = (Integer.toString(i));
//                System.out.println(strHour);
//            }
//        }
//        for (int i = 0; i <= capMinute; i++) {
//            if (i < 10) {
//                String strMinute = ('0' + Integer.toString(i));
//                System.out.println(strMinute);
//            } if (i > 10) {
//                String strMinute = (Integer.toString(i));
//                System.out.println(strMinute);
//            }
//
//    }
//}
//
////
////        for (int j = 0; j <= capMinute; j++) {
////            System.out.println(j);
////        }
////
////    }
////}
