package java224.hw04Bin.version;

//  Задание 7
//  Определить значение i-го бита числа N. Вывести резуль-
//  тат на консоль в двоичном виде.

public class Task7test {
    public static void main(String[] args) {
        int flags = (byte) 0b1000101;
        int mask = 1;
        int n = 2;
        int result = flags & (mask << n);
        System.out.printf(
                "\n%32s \n%32s = \n%32s\n",
                (Integer.toBinaryString(flags)),
                (Integer.toBinaryString(~(mask << n))),
                (Integer.toBinaryString(result)));
    }
}
