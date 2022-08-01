package java224.hw05ifElse;

public class Test03004 {
    public static void main(String[] args) {
        int summPow = 0;
        int sourceNumber = 1;
        int numberCap = 1000;
        int number = sourceNumber;
        for (sourceNumber = 1; sourceNumber < numberCap;sourceNumber++){
        for (int j = 1; j < sourceNumber; j++) {
            // непонял по чему пришлось сделать этот костыль что бы не было цикла на 0 но как от этого избавиться?
//            if (number == 0) {
//                break;
//            }
                for (int i = 0; i < number; i++) {
                    summPow += (int) Math.pow(number % 10, 3);
                    number /= 10;
                    if (number == 0) {
                        if (sourceNumber == summPow) {
                            System.out.println("Самовлюблённое число или число Армстронга " + summPow);
//                            break;
                        }
                    }
                }
            }
        }
    }
}


// Узнал колличество символов
// String aString = Integer.toString(number);
// int lengthNum = aString.length();
// System.out.println("колличество символов" + lengthNum);