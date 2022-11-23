package io.hexlet.shablon;

public class ReturnFull {
    public static void main(String[] args) {
        String endStr = encrypt("attack");
        System.out.println(endStr);
    }

    public static String encrypt(String str) {
        String resultPair = "";
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
//      создаю пары
            String pair = (((str.charAt(i)) + "" + (str.charAt(++i))));
//      реверс пар
            String reversedPair = (pair.charAt(1) + "" + pair.charAt(0));
            resultPair = resultPair + "" + reversedPair;
            // если последний символ не четный то он его оставляет в конце
            result = (resultPair + ((str.length() % 2) == 1 ? (str.charAt((str.length() - 1))) : ""));
        }
        return result;
    }
}