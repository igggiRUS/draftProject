package java224.hw04Bin;

/**
 * Задание 12
 * Проверить, есть ли в двоичной записи числа n хотя бы
 * один 0. Используя только побитовые и условные операторы.
 * Вывести на консоль исходное число в двоичном виде и ре-
 * зультат
 */
public class Task12 {
    public static void main(String[] args) {

        int flags = 15368;
        int mask = 1;
// Сдвиг каждого бита
        int shift0 = 0;
        int shift1 = 1;
        int shift2 = 2;
        int shift3 = 3;
        int shift4 = 4;
        int shift5 = 5;
        int shift6 = 6;
        int shift7 = 7;
        int shift8 = 8;
        int shift9 = 9;
        int shift10 = 10;
        int shift11 = 11;
        int shift12 = 12;
        int shift13 = 13;
        int shift14 = 14;
        int shift15 = 15;
        int shift16 = 16;
        int shift17 = 17;
        int shift18 = 18;
        int shift19 = 19;
        int shift20 = 20;
        int shift21 = 21;
        int shift22 = 22;
        int shift23 = 23;
        int shift24 = 24;
        int shift25 = 25;
        int shift26 = 26;
        int shift27 = 27;
        int shift28 = 28;
        int shift29 = 29;
        int shift30 = 30;
        int shift31 = 31;
        int shift32 = 32;
        
        //        флаг отрицательный  что бы нули стали положительные
        //        а после сложить и понять были они или нет
        
        int result0 = (~flags & (mask << shift0));
        int result1 = (~flags & (mask << shift1));
        int result2 = (~flags & (mask << shift2));
        int result3 = (~flags & (mask << shift3));
        int result4 = (~flags & (mask << shift4));
        int result5 = (~flags & (mask << shift5));
        int result6 = (~flags & (mask << shift6));
        int result7 = (~flags & (mask << shift7));
        int result8 = (~flags & (mask << shift8));
        int result9 = (~flags & (mask << shift9));
        int result10 = (~flags & (mask << shift10));
        int result11 = (~flags & (mask << shift11));
        int result12 = (~flags & (mask << shift12));
        int result13 = (~flags & (mask << shift13));
        int result14 = (~flags & (mask << shift14));
        int result15 = (~flags & (mask << shift15));
        int result16 = (~flags & (mask << shift16));
        int result17 = (~flags & (mask << shift17));
        int result18 = (~flags & (mask << shift18));
        int result19 = (~flags & (mask << shift19));
        int result20 = (~flags & (mask << shift20));
        int result21 = (~flags & (mask << shift21));
        int result22 = (~flags & (mask << shift22));
        int result23 = (~flags & (mask << shift23));
        int result24 = (~flags & (mask << shift24));
        int result25 = (~flags & (mask << shift25));
        int result26 = (~flags & (mask << shift26));
        int result27 = (~flags & (mask << shift27));
        int result28 = (~flags & (mask << shift28));
        int result29 = (~flags & (mask << shift29));
        int result30 = (~flags & (mask << shift30));
        int result31 = (~flags & (mask << shift31));
        int result32 = (~flags & (mask << shift32));
        int result = result0 + result1 + result2 + result3 + result4 + result5 + result6 + result7 + result8 + result9 + result10 + result11 + result12 + result13 + result14 + result15 + result16 + result17 + result18 + result19 + result20 + result21 + result22 + result23 + result24 + result25 + result26 + result27 + result28 + result29 + result30 + result31 + result32;

        System.out.println(Integer.toBinaryString(flags));
        System.out.println(Integer.toBinaryString(result0));
        System.out.println(Integer.toBinaryString(result1));
        System.out.println(Integer.toBinaryString(result2));
        System.out.println(Integer.toBinaryString(result3));
        System.out.println(Integer.toBinaryString(result4));
        System.out.println(Integer.toBinaryString(result5));
        System.out.println(Integer.toBinaryString(result6));
        System.out.println(Integer.toBinaryString(result7));
        System.out.println(Integer.toBinaryString(result8));
        System.out.println(Integer.toBinaryString(result9));
        System.out.println(Integer.toBinaryString(result10));
        System.out.println(Integer.toBinaryString(result11));
        System.out.println(Integer.toBinaryString(result12));
        System.out.println(Integer.toBinaryString(result13));
        System.out.println(Integer.toBinaryString(result14));
        System.out.println(Integer.toBinaryString(result15));
        System.out.println(Integer.toBinaryString(result16));
        System.out.println(Integer.toBinaryString(result17));
        System.out.println(Integer.toBinaryString(result18));
        System.out.println(Integer.toBinaryString(result19));
        System.out.println(Integer.toBinaryString(result20));
        System.out.println(Integer.toBinaryString(result21));
        System.out.println(Integer.toBinaryString(result22));
        System.out.println(Integer.toBinaryString(result23));
        System.out.println(Integer.toBinaryString(result24));
        System.out.println(Integer.toBinaryString(result25));
        System.out.println(Integer.toBinaryString(result26));
        System.out.println(Integer.toBinaryString(result27));
        System.out.println(Integer.toBinaryString(result28));
        System.out.println(Integer.toBinaryString(result29));
        System.out.println(Integer.toBinaryString(result30));
        System.out.println(Integer.toBinaryString(result31));
        System.out.println(Integer.toBinaryString(result32));

        System.out.printf("В двоичном числе %s" +
                "\n %d флагов (нулей) ", Integer.toBinaryString(flags), result);
    }
}
