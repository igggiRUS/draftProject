package hw04inary;

import java.util.Scanner;

/**
 * Программа переводит битвое значение в десятичное число
 */
public class bitToDecimal {
	public static void main(String[] args) {
		System.out.println("Введите число побитовое только 0 и 1");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		// Целое.РазобратьЧисло(str, 2); число 2 это основание (битность) степень
		System.out.println("колличество символов: " + str.length());
		System.out.println("так число выглядит в бинарном виде: " + Integer.parseInt(str, 2));
		}
}
