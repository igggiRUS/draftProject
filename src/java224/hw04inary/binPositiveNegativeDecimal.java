package hw04inary;

import java.util.Scanner;

/**
 * Ввод положительного десятичного числа
 * Перевод в двоичное число
 * Перевод в отрицательное двоичное число число
 * Перевод в отрицательное десятичное число
 * Так же добавляте нули перед положительным числом
 * Конвертировать числа не просто пришлось рыться гуглить стекОверфлоу помог 
 * https://stackoverflow.com/questions/14883428/java-convert-binary-string-to-int
 */

public class binPositiveNegativeDecimal {
	public static void main(String[] args) {
		// побитовое НЕ отрицание тильда добавляет отрицание
		System.out.println("Введите число: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		int zeroBit = 32;
		String str = "0";
		
		System.out.println("положительное десятичное число:  " + x);
		System.out.println("отрицательное десятичное число: "	+ (Integer.parseUnsignedInt(Integer.toBinaryString(~x), 2) + 1));
		System.out.println();
		System.out.println("положительное: " + str.repeat((zeroBit - (Integer.toBinaryString(x)).length())) + "" + Integer.toBinaryString(x));
		System.out.println("отрицательное: " + Integer.toBinaryString(~x));
		
		System.out.println();
		System.out.println("Отрицательное число было сконвертированно из побитового отрицательного чилса");
	}
}
