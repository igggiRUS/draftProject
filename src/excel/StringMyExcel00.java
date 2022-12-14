//package excel;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.Scanner;
//
//public class StringMyExcel00 {
//    public static void main(String[] args) throws FileNotFoundException {
//        FileReader reader = new FileReader(new File("/home/misha/Документы/md/excel_md/nnn.txt"));
//        Scanner scan = new Scanner(reader);
//        String str = scan.nextLine();
//
//        System.out.println(str);
//        scan.close();
////        String findElement = "\\t\\t"; // ищем это словосочетание
//
////        фиксированный поиск
////        Pattern pattern = Pattern.compile(findElement);
////        Matcher matcher = pattern.matcher(str);
////        int count = 0;
////        while(matcher.find())
//
////            count++;
////        System.out.println("найдено " + count + " совпадений");
//
//
//        str.replaceAll("\t\t+", " ");
//        System.out.println(str.replaceAll("\t+", " "));
//
//    }
//}