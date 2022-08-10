package java224.hw06ifElse;

public class Test000 {
    public static void main(String[] args) {
        int size = 5;
        // зеркало низа
        for (int k = 0; k <= size; k++) {
            System.out.print("a ");
        }
        System.out.print("b\n");
//        переходит на другой ряд при получении значения (true) исполняет следуюущее действие значения
        for (int i = 0; i <= size; i++) {
            for (int f = 0; f < i; f++) {
                System.out.print("c ");
            }
            System.out.print("d ");
//            от общей суммы отнимает верхний счетчик
            for (int j = 0; j < size - i; j++) {
                System.out.print("e ");
//                for (int z = 0; z < j; z++) {
                }
                System.out.println("f ");
            }
        // зеркало верха
        for (int k = 0; k <= size; k++) {
            System.out.print("g ");
        }
        System.out.print("j\n");
        }
    }
