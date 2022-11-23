package io.hexlet;

public class WWW {
    public static void main(String[] args) {
        String str = "asfdasdfas";
        System.out.println();
        int strSub = str.length();
//        System.out.println("длинна строки: " + strSub);
        char strChar = str.charAt((strSub-1));
        String sss = (str.substring(str.length()));
        System.out.println(sss);
        System.out.println("последняя буква: " + strChar);
//        System.out.println(str.length() - 1);
    }
}
