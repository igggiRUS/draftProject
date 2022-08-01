package java224.hw05ifElse;

public class Test03006Start {
    public static void main(String[] args) {
        int summPow = 0;
        int numberCap = 200;
        int sourceNumber;
        int thisNumber = 0;
        int i;
        for (sourceNumber = 153; sourceNumber < numberCap; sourceNumber++) {
//        добавил  thisNumber мне нужен был он не изменяемый
            thisNumber = sourceNumber;
            // специально i = 0 потому что в противном случае если цифры маленькие
            // то i становится  больше текущего числа и цикл перестает правильно считать
            // так же пришлось сделать i--  что бы оно не было больше текущего числа
            for (i = 0; i < sourceNumber; i--) {
                summPow += (int) Math.pow(sourceNumber % 10, 3);
                sourceNumber /= 10;

                if (thisNumber == summPow) {
                    System.out.println("Самовлюблённое число или число Армстронга " + summPow);
                    if (thisNumber != summPow) {
                        System.err.println("x_X " + summPow);
                        break;
                    }
                }
            }
            System.err.println("Просто число " + summPow);
        }
    }
}