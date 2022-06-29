package java224.hw04Binary;

import java.util.Scanner;

public class task3v0 {
    public static void main(String[] args) {

        System.out.println("\nЗадача №3\n\nУсловие задачи\nУстановить i-й бит числа N равным 1.\nВывести результат на консоль в двоичном виде.\n");
        // цифры на выбор
        // так как это неизменные цифры я их задал как final
        final int a = 1; // бит который возводится в степень
        final int zeroBit = 32; // колличество нулей если в 32 битной строке длинна
        final String strZero = "0"; // так как на выход подается стринговая строка то вместо нуля можно подставить любой символ. Понимаю это костыльно делал для красоты.


        // степень числа
        for (int degree = 0; degree < 9; degree++) {
            int z = a << degree;
            System.out.printf("%2d) %11s %32s\n", (degree + 1), z, ((strZero.repeat((zeroBit - (Integer.toBinaryString(z)).length())) + "" + Integer.toBinaryString(z))));
        }
        // сделал дубль понимаю это плохо но волны не хотел когда 1 цифра прибавилась
        for (int degree = 9; degree < 32; degree++) {
            int z = a << degree;
            System.out.printf("%d) %11s %32s\n", (degree + 1), z, ((strZero.repeat((zeroBit - (Integer.toBinaryString(z)).length())) + "" + Integer.toBinaryString(z))));
        }
        System.out.println("\nВам на выбор предлагается число десятичное число в бинарном виде.\n" +
                "Записывается с помощью 1 бита остальные биты 0.\n");
            System.out.println("Введите первое число" +
                    "\nв котором надо сделать изменения," +
                    "\nнапример дату рождения 24081979.\n" +
                    "Ввод: ");
            String strBit = "24081979 1024";
            Scanner scanner = new Scanner(strBit);
//            Scanner scanner = new Scanner(System.in);
            int firstDec = scanner.nextInt();
            String importBin1 = strZero.repeat((zeroBit - (Integer.toBinaryString(firstDec)).length())) + "" + Integer.toBinaryString(firstDec);
            System.out.printf("Вы ввели число %d представленное в двоичном виде как %32s\n", firstDec, importBin1);

            System.out.println("Выше представлена таблица из 32 сток с порядковым номером.\n" +
                    "Выберите строку по порядковому номеру с лева.\n" +
                    "Скопируйте десятичное число с права от довичного\n" +
                    "Введите число которое вы выбрали из таблицы: ");
            int secondDec = scanner.nextInt();
            scanner.close();
            String importBin2 = strZero.repeat((zeroBit - (Integer.toBinaryString(secondDec)).length())) + "" + Integer.toBinaryString(secondDec);
            System.out.printf("Число 1: %32s\n", importBin1);
            System.out.printf("Число 2: %32s\n", importBin2);
//           побитовое смещение.
//        int binDel = ()
        String binFirst =Integer.toBinaryString(firstDec);
        System.out.println("bin1: " + binFirst);
        String binSecond =Integer.toBinaryString(secondDec);
        System.out.println("bin2: " + binSecond);
        System.out.println(Integer.valueOf(binFirst));
        //        System.out.println( (binFirst) ^ binSecond);
//        System.out.printf("деление: %32s", Integer.parseInt());
        }
    }




