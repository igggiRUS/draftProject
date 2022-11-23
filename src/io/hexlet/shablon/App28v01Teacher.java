package io.hexlet.shablon;

public class App28v01Teacher {
public static void main(String[] args) {
//       ввод в метод
    String endStr = encrypt("Afrack!");
//        вывод из метода
    System.out.println(endStr);
}
    public static String encrypt(String str) {
        // BEGIN
        var result = "";
        for (var i = 0; i < str.length(); i += 2) {
            var nextSymbol = (i + 2 > str.length()) ? "" : str.substring(i + 1, i + 2);
            result = result + nextSymbol + str.charAt(i);
        }

        return result;
        // END
    }
}