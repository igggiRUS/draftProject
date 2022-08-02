//
// Набор странных примеров, которые либо что-то прояснят, либо запутают вас
//
package java224.hw06ifElse;

import java.util.Arrays;
import java.util.Scanner;

public class WierdExamples_v2 {
	public static void main(String[] args) {
		// эта переменная - всего лишь ссылка
		long[] longNumbers; // лучше ниписать: long[] longNumbers = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("type word: ");
		boolean isFive = sc.next().equals("five");

		if (isFive) {
			longNumbers = new long[5];
		} else {
			longNumbers = new long[10];
		}
		
		
			
		// сохраняем в массив числа в квадрате; от 1**2 до 3**2
		for (int i = 0; i < longNumbers.length; i++) {
			longNumbers[i] = (i + 1) * (i + 1);
		}
		
		// вывод массива в консоль
		System.out.println("longNumbers 1");
		for (int i = 0; i < longNumbers.length; i++) {
			System.out.print(longNumbers[i] + " ");
		}
		System.out.println();
		
		
		
		// никто не мешает создать другой массив и сохранить в ту же ссылку 
		longNumbers = new long[] { 17, 23, 5, 113, 31, 3_000_000_000L };

		// вывод другого массива по той же ссылке в консоль
		System.out.println("longNumbers 2");
		// i: 0 1 2 3 4
		for (int i = 0; i < longNumbers.length; i++) {
			System.out.printf("%d: %d -- %d\n", i, longNumbers[i], longNumbers[3]);
		}
		System.out.println();
		
		System.out.print("longNumbers -> ");
		String str = Arrays.toString(longNumbers);
		System.out.println(str);
		
		// теперь есть две переменных-ссылки на один и тот же массив
		long[] alsoLongNumbers = longNumbers;
		
		// изменим число в массиве по ссылке longNumbers
		// это отразится на alsoLongNumbers, потому что массив один и тот же
		longNumbers[0] = 777;
		
		// вывод массива после изменения элемента
		System.out.println("longNumbers 3");
		for (int i = 0; i < longNumbers.length; i++) {
			System.out.print(longNumbers[i] + " ");
		}
		System.out.println();
		
		// вывод того же массива по другой ссылке
		System.out.println("alsoLongNumbers 1");
		for (int i = 0; i < alsoLongNumbers.length; i++) {
			System.out.print(alsoLongNumbers[i] + " ");
		}
		System.out.println();
		
		
		// Оператор new создает массив, которым уже (!) можно пользоваться.
		// Переменная-ссылка нужна, чтобы к массиву можно было получить доступ в дальнейшем.
		//
		// Ниже создается массив, который никуда не сохраняется.
		// Однако мы все равно можем с ним поработать, пока он не потерялся.
		// Например достать из него элемент под индексом 1.
		
		String wordHere = (new String[] {"Что", "тут", "происходит", "?"})[sc.nextInt()];
		System.out.printf("Слово '%s' из массива без ссылки\n", wordHere);
		
		int len = (new String[] {"Что", "тут", "происходит", "?"}).length;
		System.out.println("length = " + len);
		
		String[] words = new String[] {"Что", "тут", "происходит", "?"};
		System.out.println("length = " + words.length);
		for (int i = 0; i < words.length; i++) {
			String w = words[i];
			System.out.println(w);
		}
		
		sc.close();
	}
}
