package java224.hw05ifElse;

public class Test03007Loop {
    public static void main(String[] args) {
        int summPow =0;
        int numberCap = 200;
        int sourceNumber;
        int i;
for (sourceNumber = 10;sourceNumber < numberCap;sourceNumber++)
            for (i = 1; i < sourceNumber; i++) {
                summPow += (int) Math.pow(sourceNumber % 10, 3);
                sourceNumber /= 10;
                    if (sourceNumber == summPow) {
                        if (summPow > i) {
                            break;
                        }
                        System.out.println("Самовлюблённое число или число Армстронга " + summPow);
                            break;
                    }
                }
            }
        }
//    }
//}
