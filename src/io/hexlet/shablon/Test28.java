package io.hexlet.shablon;

public class Test28 {
    public static void main(String[] args) {
        String str = String.valueOf(symbol("sdfSDf"));
        var i = 0;
        System.out.println(str);
        boolean result = false;
}

    public static int symbol(String str) {
        int result = 0;
        int sumbolCaps = 0;
        for (var i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            char b = str.toUpperCase().charAt(i);
            sumbolCaps = (a == b ? 1 : 0);
            result = result + sumbolCaps;
        }
        return result;
    }
}