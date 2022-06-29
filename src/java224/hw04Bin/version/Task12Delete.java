//package java224.hw04Bin.version;
//
///**
// * Задание 12
// * Проверить, есть ли в двоичной записи числа n хотя бы
// * один 0. Используя только побитовые и условные операторы.
// * Вывести на консоль исходное число в двоичном виде и ре-
// * зультат
// */
//public class Task12Delete {
//    public static void main(String[] args) {
//
//        int flag = 125676;
//        byte mask = 0b10;
//
//        int shift0 = 0;
//        int shift1 = 1;
//        int shift2 = 2;
//        int shift3 = 3;
//        int shift4 = 4;
//        int shift5 = 5;
//        int shift6 = 6;
//        int shift7 = 7;
//        int shift8 = 8;
//        int shift9 = 9;
//        int shift10 = 10;
//        int shift11 = 11;
//        int shift12 = 12;
//        int shift13 = 13;
//        int shift14 = 14;
//        int shift15 = 15;
//        int shift16 = 16;
//        int shift17 = 17;
//        int shift18 = 18;
//        int shift19 = 19;
//        int shift20 = 20;
//        int shift21 = 21;
//        int shift22 = 22;
//        int shift23 = 23;
//        int shift24 = 24;
//        int shift25 = 25;
//        int shift26 = 26;
//        int shift27 = 27;
//        int shift28 = 28;
//        int shift29 = 29;
//        int shift30 = 30;
//        int shift31 = 31;
//        int shift32 = 32;
////        флаг отрицательный  что бы нули стали положительные
////        а после сложить и понять были они или нет
//        int result0 = (~flag << shift0) & mask;
//        int result1 = (~flag << shift1) & mask;
//        int result2 = (~flag << shift2) & mask;
//        int result3 = (~flag << shift3) & mask;
//        int result4 = (~flag << shift4) & mask;
//        int result5 = (~flag << shift5) & mask;
//        int result6 = (~flag << shift6) & mask;
//        int result7 = (~flag << shift7) & mask;
//        int result8 = (~flag << shift8) & mask;
//        int result9 = (~flag << shift9) & mask;
//        int result10 = (~flag << shift10) & mask;
//        int result11 = (~flag << shift11) & mask;
//        int result12 = (~flag << shift12) & mask;
//        int result13 = (~flag << shift13) & mask;
//        int result14 = (~flag << shift14) & mask;
//        int result15 = (~flag << shift15) & mask;
//        int result16 = (~flag << shift16) & mask;
//        int result17 = (~flag << shift17) & mask;
//        int result18 = (~flag << shift18) & mask;
//        int result19 = (~flag << shift19) & mask;
//        int result20 = (~flag << shift20) & mask;
//        int result21 = (~flag << shift21) & mask;
//        int result22 = (~flag << shift22) & mask;
//        int result23 = (~flag << shift23) & mask;
//        int result24 = (~flag << shift24) & mask;
//        int result25 = (~flag << shift25) & mask;
//        int result26 = (~flag << shift26) & mask;
//        int result27 = (~flag << shift27) & mask;
//        int result28 = (~flag << shift28) & mask;
//        int result29 = (~flag << shift29) & mask;
//        int result30 = (~flag << shift30) & mask;
//        int result31 = (~flag << shift31) & mask;
//        int result32 = (~flag << shift32) & mask;
//        int result0ZEROVerni = (~flag & (mask << shift0));
//        int result = result0 + result1 + result2 + result3 + result4 + result5 + result6 + result7 + result8 + result9 + result10 + result11 + result12 + result13 + result14 + result15 + result16 + result17 + result18 + result19 + result20 + result21 + result22 + result23 + result24 + result25 + result26 + result27 + result28 + result29 + result30 + result31 + result32;
//        System.out.printf("В двоичном числе %s %d флагов (нулей) ", Integer.toBinaryString(flag), result);
//    }
//}
