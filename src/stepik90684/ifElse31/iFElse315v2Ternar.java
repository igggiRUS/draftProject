package ifElse31;

import java.util.Scanner;

public class iFElse315v2Ternar {

	/*
	 * Вычисляем длинну строк
	 * решение через тернарный оператор
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.print(sc.nextLine().length() > sc.nextLine().length() ? "Махатма" : "Джавахарлал");
	}
}
