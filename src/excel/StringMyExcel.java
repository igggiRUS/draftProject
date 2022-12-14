package excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringMyExcel {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader(new File("/home/misha/Документы/md/excel_md/nnn.txt"));
        Scanner scan = new Scanner(reader);
        String strExcel = scan.nextLine();
        System.out.println(strExcel);
        scan.close();

        //Подсчет дублей табуляции

        int voidCells = tabDuplicates(12);
        System.out.println("колличество пустых ячеек " + voidCells);
    }
    public static int tabDuplicates(int numberOfDuplicates) {     // метод      // метод считает пустые ячейки подряд
        int result = 0;
        if (numberOfDuplicates > 2) {
            result = numberOfDuplicates - 1;
        } else {
            System.out.println("пустых ячеек нет");
            result = 0;
        }
        return result;
    }
}


//ЗАМЕНА ДУБЛЕЙ
//        strExcel.replaceAll("\t\t+", " ");
//        System.out.println(strExcel.replaceAll("\t+", " "));