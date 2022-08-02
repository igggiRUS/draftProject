//
// суммирование чисел без массива для сравнения
//
package java224.hw06ifElse;

import java.util.Locale;
import java.util.Scanner;

public class IncomeTask_Antipod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("Введите количество дней: ");
		int size = sc.nextInt();

		double sum = 0;
		System.out.println("Введите доход на каждый день:");
		for (int i = 0; i < size; i++) {
			System.out.printf("День №%d: ", i + 1);
			sum += sc.nextDouble();
		}
		
		System.out.println("Общий доход: " + sum);
		
		sc.close();
	}
}
