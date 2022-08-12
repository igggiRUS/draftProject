package java224.hw06ifElse;

        public class Test004 {
            public static void main(String[] args) {
                int count = 10;
                for (int j =1; j <= count; j++) {
                    System.out.print("*");
                }
                System.out.println();
                for (int i = 1; i <= count - 2; i++) {
                    System.out.print("*");
                    for (int j = 2; j <= count - 1; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println();
                }
                for (int j = 1; j <= count; j++) {
                    System.out.print("*");
                }
            }
        }
