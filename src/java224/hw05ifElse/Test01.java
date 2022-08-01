package java224.hw05ifElse;

public class Test01 {
    public static void main(String[] args) {
//        сравниваются десятки       && сравниваются единицы
//        if ((h / 10) % 10 == m % 10 && h % 10 == (m / 10) % 10) {
        int h = 31;
        int m = 13;
//        System.out.println((h / 10) % 10 == m % 10 );
//        System.out.println((h/10) %10);
//        System.out.println(m % 10);
//        System.out.println();
        System.out.println(h % 10 == (m / 10) % 10);
        System.out.println(h % 10);
        System.out.println((m / 10) % 10);

    }
}
