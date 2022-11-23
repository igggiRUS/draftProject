package io.hexlet;

public class App2829 {
    public static void main(String[] args) {

        boolean str = greaterThan("AAAA", "aaaa");
        boolean result = false;
  }
    public static boolean greaterThan(String str11, String str22) {
        int strLength1 = 0;
        int result1 = 0;

        for (var i = 0; i < str11.length(); i++) {
            char a = str11.charAt(i);
            char b = str11.toUpperCase().charAt(i);
            strLength1 = (a == b ? 1 : 0);
            result1 = result1 + strLength1;
        }

        int strLength2 = 0;
        int result2 = 0;

        for (var i = 0; i < str22.length(); i++) {
            char c = str22.charAt(i);
            char d = str22.toUpperCase().charAt(i);
            strLength2 = (c == d ? 1 : 0);
            result2 = result2 + strLength2;
        }
          return (result1 > result2);
    }
    // END
}
