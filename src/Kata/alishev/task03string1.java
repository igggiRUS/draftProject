package Kata.alishev;

//  https://www.youtube.com/watch?v=ERTDiGH3XUA
//  Java SE. Урок 26. Класс String и его методы
public class task03string1 {
    public static void main(String[] args) {
//        Класс по умолчанию final от него нельзя наследоваться public final class String
//        При нажатии "ctrl + P" видно, что может принимать данный класс
//        Литерал заключен в кавычки

        String str1 = new String("JAva");
        String str2 = "java";
        String str3 = "";
        String str4 = "Hot javaHello";
        String str5 = "       Hot javaHello    ";
        str1.charAt(0);
        str2.charAt(1);
        System.out.println(str1.charAt(2));
//        возвращает код символа unicode
        System.out.println(str1.codePointAt(2));
//        принимает объект типа Object так как все Классы наследованны от Object а String это класс (С большой буквы) то можно передать строку.
        System.out.println(str1.equals(str2));
//        игнорирует Case капсы поэтому будет boolean = true;
        System.out.println(str1.equalsIgnoreCase(str2));
//        возвращает хэшкод объекта
        System.out.println(str1.hashCode());
//        если в строке есть элемент unicode равный 65 то возвращается 1  (unicode 65 = A)
        System.out.println(str1.indexOf(65));
//        если в строке есть элемент unicode равный 64, то возвращается -1
        System.out.println(str1.indexOf(64));
//        возвращает true если длинна строки  = 0   boolean true if length = 0
        System.out.println(str1.isEmpty());
        System.out.println(str3.isEmpty());
//        возвращает длинну строки
        System.out.println(str1.length());
//        Метод принимает разделитель и возвращает массив стрингов  разделителем служит символ заключенный в кавычках
        String[] strings = str4.split(" ");
//        for each выводит разрезанный текст каждый на отдельной строке как разные элемены
        for (String element1 : strings) {
            System.out.println(element1);
//            13:47
//            вырезает со 2 по 8 индекс  Пример: ХорошоОчень    рошоОч
            System.out.println(str4.substring(2, 8));
//              разбиваем массив по символьно
            char[] charArray = str4.toCharArray();
            for (char element2 : charArray) {
                System.out.println(element2);
            }
//                все строчные
            System.out.println(str4.toLowerCase());
//                все прописные
            System.out.println(str4.toUpperCase());
//            обрезает пробелы в начале и конце строки
            System.out.println(str5);
            System.out.println(str5.trim());
            String.valueOf(str5);
            // число 65 превратилась в строку
            System.out.println(String.valueOf(65));
//            принимает массив чаров и преобразует их в строку
//            String.copyValueOf();
        }
    }
}
