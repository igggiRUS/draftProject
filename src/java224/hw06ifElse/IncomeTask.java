package java224.hw06ifElse;

import java.util.Locale;
import java.util.Scanner;

public class IncomeTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("Введите количество дней: ");
		int size = sc.nextInt(); // размер массива задается целым числом (попробуйте -1)
		double[] income = new double[size]; // общепринятый синтаксис создания массива
		//double income2[] = new double[size]; // алтернативное создание ссылки на массив
		
		// заполнение массива с консоли
		System.out.println("Введите доход на каждый день:");
		for (int i = 0; i < income.length; i++) {
			System.out.printf("День №%d: ", i + 1);
			income[i] = sc.nextDouble();
		}
		
		// сумма по всем элементам массива
		double sum = 0;
		for (int i = 0; i < income.length; i++) {
			sum += income[i];
		}
		System.out.println("Общий доход: " + sum);

		
		// если length = 3
		// то перебираем индексы: 0 1 2
		System.out.println("Доход по дням:");
		for (int i = 0; i < income.length; i++) {
			System.out.printf("%f ", income[i]);
		}
		System.out.println();

		// если length = 3
		// то перебираем индексы: 2 1 0
		System.out.println("В обратном порядке:");
		for (int i = income.length - 1; i >= 0; i--) {
			System.out.printf("%f ", income[i]);
		}
		System.out.println();

		// переменная-счетчик и индекс элемента - не обязательно одно и то же
		System.out.println("В обратном порядке:");
		for (int i = income.length; i > 0; i--) {
			int index = i - 1;
			System.out.printf("%f ", income[index]);
		}
		System.out.println();
		

		// переменная-счетчик и индекс элемента - не обязательно одно и то же
		System.out.println("Элементы массива с повтором:");
		for (int i = 0; i < 100; i++) {
			// length = 3
			//      i = 0 1 2 3 4 5 6 7 8 9 10 11 12 ...
			//  i % 3 = 0 1 2 0 1 2 0 1 2 0  1  2  0 ...
			System.out.printf("%f ", income[i % income.length]);
		}
		System.out.println();
		
		
		sc.close();
	}
}
