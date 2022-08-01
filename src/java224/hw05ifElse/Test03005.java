package java224.hw05ifElse;

public class Test03005 {
    public static void main(String[] args) {
        int summPow = 0;
        int numberCap = 200;
        int sourceNumber = 1;
        int number = sourceNumber;
        int i = 0;
        for (sourceNumber = 10; sourceNumber < numberCap; sourceNumber++) {
            for (i = 10; i < sourceNumber; i++) {
                summPow += (int) Math.pow(number % 10, 3);
                number /= 10;
                if (number == 0) {
                    break;
                }
            }
            if (sourceNumber == summPow) {
                System.out.println("Самовлюблённое число или число Армстронга " + summPow);
            }

        }
    }
}
