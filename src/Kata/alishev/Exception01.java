package Kata.alishev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TODO:Exception = исключения
public class Exception01 {
    public static void main(String[] args) {
        File file = new File("t.txt");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("После сканера");
        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }
        System.out.println("После блока try catch");

//        String str = scanner.nextLine();
//        System.out.println(str);
    }
}
