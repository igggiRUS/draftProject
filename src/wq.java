import java.util.Scanner;

public class wq {

    class Example {
        public static void main(String[] args) {
            int a = 8;
            int b = 4;
            int c = 6;
            int n;

            if (a > b) {
                n = a;
                a = b;
                b = n;
            }
            if (b > c) {
                n = b;
                b = c;
                c = n;
            }
            if (a > b) {
                n = a;
                a = b;
                b = n;
            }

            System.out.print(b);
        }
    }
}
