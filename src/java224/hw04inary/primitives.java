package java224.hw04inary;

import java.util.Scanner;

public class primitives {
	public static void main(String[] args) {

		/**
		 * Ввод положительного десятичного числа
		 * Перевод в двоичное число
		 * Перевод в отрицательное двоичное число число
		 * Перевод в отрицательное десятичное число
		 * Так же добавляте нули перед положительным числом
		 * Конвертировать числа не просто пришлось рыться гуглить стекОверфлоу помог
		 * https://stackoverflow.com/questions/14883428/java-convert-binary-string-to-int
		 */
		int aBin = 0b0100;
		System.out.printf("%3d -> %32s\n", aBin, Integer.toBinaryString(aBin));
		int bBin = 0b1100;
		System.out.printf("%3d -> %32s\n", bBin, Integer.toBinaryString(bBin));
		int result1 = aBin & bBin;
		System.out.printf("%d & %d %d\n", aBin, bBin, result1);

		int result2 = 0b0100 & 0b1100;
		System.out.printf("%d & %d %d\n", aBin, bBin, result1);

		int zeroBit = 32;
		String str = "0";
		System.out.println("положительное десятичное число:  " + aBin);
		System.out.println(
				"отрицательное десятичное число: " + (Integer.parseUnsignedInt(Integer.toBinaryString(~aBin), 2) + 1));
		System.out.println();
		System.out.println("положительное: " + str.repeat((zeroBit - (Integer.toBinaryString(aBin)).length())) + ""
				+ Integer.toBinaryString(aBin));
		System.out.println("отрицательное: " + Integer.toBinaryString(~aBin));
		System.out.println("положительное десятичное число:  " + bBin);
		System.out.println(
				"отрицательное десятичное число: " + (Integer.parseUnsignedInt(Integer.toBinaryString(~bBin), 2) + 1));
		System.out.println();
		System.out.println("положительное: " + str.repeat((zeroBit - (Integer.toBinaryString(bBin)).length())) + ""
				+ Integer.toBinaryString(bBin));
		System.out.println("отрицательное: " + Integer.toBinaryString(~bBin));
		System.out.println();
/**
 *
 *
 *
 *
 *
 *
 *
 *
 */

		// форма записи побитовго числа
		int a = 0b100;
		System.out.println("Битовая форма записи числа int = 0b100\nРавна десятичному числу: " + a);
		int bitMax = 0b1111111111111111111111111111111;
		int bitMinus = 0b10000000000000000000000000000000;
		String pluse = "1111111111111111111111111111111";
		String minus = "10000000000000000000000000000000";
		System.out.println("так выглядит максимально возможное число в десятичном виде: " + bitMax);
		System.out.println("так выглядит отрицательное число: " + bitMinus);
		System.out.printf("\nМаксимальная длинна строки %d символов положительного числа ", pluse.length());
		System.out.printf("\nМаксимальная длинна строки %d символов отрицательного числа ", minus.length());
		System.out.println(
				"\nПри записи 32 символов число становится отритацельным так как как первое число (32) задает при значении 1 отрицательное число");
// побитовое НЕ
		int x = 342;
		System.err.println("побитовое ДА");
		System.out.println(Integer.toBinaryString(x));
		System.err.println("побитовое НЕ");
		System.out.println(Integer.toBinaryString(~x));
		
		System.out.println("Виды записей в разных системах");
		
	    byte b1 = 0xC; // HEX
	    byte b2 = 12; // DEC
	    byte b3 = 014; // OCT
	    byte b4 = 0b1100; // BIN

	    short sh1 = 0x32C8; // HEX
	    short sh2 = 13000; // DEC
	    short sh3 = 031310; // OCT
	    short sh4 = 0b11001011001000; // BIN

	    long long1 = 0x75BCD15; // HEX
	    long long2 = 123456789L; // DEC
	    long long3 = 0726746425; // OCT
	    long long4 = 0b111010110111100110100010101; // BIN

	    short zero1 = 0; // HEX
	    short zero2 = 0; // DEC
	    short zero3 = 0; // OCT
	    short zero4 = 0; // BIN

	    boolean boolTrue = true;
	    boolean boolFalse = true;
	    short short12 = 12;
	    int int12 = 12;
	    long long12 = 12L; // long
	    float float12 = 12F; //float
	    double double12 = 12.45;
	    double double14 = 14.50D; // double

	    String string1 = "Am Mike";
	    String string2 = "чар для одиночного символа стринд для строки";
	    String string3 = "Hello";
	    String string4 = "BB";

	    char char1 = 'M';
	    char char2 = '\u004D'; // система unicode
	    char char3 = 0x4D; // 16 код буквы
	    char char4 = ' '; // пробел тоже символ


	    System.out.println(b1);
	    System.out.println(b2);
	    System.out.println(b3);
	    System.out.println(b4);

	    System.out.println();
	    System.out.println(sh1);
	    System.out.println(sh2);
	    System.out.println(sh3);
	    System.out.println(sh4);

	    System.out.println();
	    System.out.println(long1);
	    System.out.println(long2);
	    System.out.println(long3);
	    System.out.println(long4);

	    System.out.println();
	    System.out.println(zero1);
	    System.out.println(zero2);
	    System.out.println(zero3);
	    System.out.println(zero4);

	    System.out.println();
	    System.out.println(boolTrue);
	    System.out.println(boolFalse);
	    System.out.println(short12 + " " + int12 + " " + long12 + " " + float12 + " " + double12 +" " + double14);

	    System.out.println();
	    System.out.println(string1);
	    System.out.println(string2);
	    System.out.println(string3);
	    System.out.println(string4);

	    System.out.println();
	    System.out.println(char1);
	    System.out.println(char2);
	    System.out.println(char3);
	    System.out.println(char4);
	}
}
