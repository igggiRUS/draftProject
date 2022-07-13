package Kata.alishev;
//  https://www.youtube.com/watch?v=ERTDiGH3XUA
//  Java SE. Урок 26. Класс String и его методы
public class task03string1 {
    public static void main(String[] args) {
//        Класс по умолчанию final от него нельзя наследоваться public final class String
//        При нажатии "ctrl + P" видно, что может принимать данный класс
//        Литерал заключен в кавычки

        String str1 = new String("java");
        String str2 = "java";
        str1.charAt(0);
        str2.charAt(1);
        System.out.println(str1.charAt(2));
//        возвращает код символа unicode
        System.out.println(str1.codePointAt(2));



    }
}
