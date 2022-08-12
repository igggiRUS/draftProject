package java224.hw06ifElse;
/**
 * Задание 4.2.3
 * Равнобедренный треугольник:
 * заполненный.
 */
public class Task030101 {
    public static void main(String[] args) {
        int size = 7;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
//                пустота с лева от пирамиды
                System.out.print(i+" ");
            }
//            Пирамида
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print(k +" ");
            }
//            перенос строки пирамиды
            System.out.println("");
        }
    }
}
