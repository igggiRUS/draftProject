package java224.hw05ifElse;

public class Task11 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 15 != 0 ){
                System.out.println(i + " fizz");
            }
            if (i % 5 == 0 && i % 15 != 0 ){
                System.out.println(i + " buzz");
            }
            if (i % 15 == 0) {
                // выделил в отдельный вывод что бы видеть
                System.out.println(i + " hiss");
        }

    }
}
}
