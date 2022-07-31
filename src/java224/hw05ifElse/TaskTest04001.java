package java224.hw05ifElse;

public class TaskTest04001 {
    public static void main(String[] args) {
        int perfectNum = 0;
        int cap = 1_000;
        int j = 1;
        int k = 0;
        for (perfectNum = 1; perfectNum < cap; perfectNum++) {
            j = 0;
            for (int i = 1; i <= perfectNum; i++) {
                if (perfectNum % i == 0)
                    j++;
                k +=j;
//                System.err.println(j);
                System.out.println(k);
            }
        }
    }
}
