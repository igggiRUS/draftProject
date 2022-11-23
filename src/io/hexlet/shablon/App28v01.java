package io.hexlet.shablon;

public class App28v01 {
    public static void main(String[] args) {
//       ввод в метод
        String endStr = encrypt("Attack");
//        вывод из метода
        System.out.println(endStr);
    }
    public static String encrypt(String str) {
        String resultPair = "";
        String result = "";
//        String pair = "";
        String reversedPair = "";
        if ((str.length() % 2 == 0)) {
            for (int i = 0; i < str.length(); i += 1) {
//      создаю пары
                String pair = (((str.charAt(i)) + "" + (str.charAt(++i))));
//      реверс пар
                reversedPair = (pair.charAt(1) + "" + pair.charAt(0));
                resultPair = resultPair + "" + reversedPair;
            }
            return resultPair;
        } else {
            for (int i = 0; i < str.length() - 1; i += 1) {
//      создаю пары
                String pair = (((str.charAt(i)) + "" + (str.charAt(++i))));
//      реверс пар
                reversedPair = (pair.charAt(1) + "" + pair.charAt(0));
                resultPair = resultPair + "" + reversedPair;
            }
            return (resultPair + str.charAt((str.length() - 1)));
        }
    }
}