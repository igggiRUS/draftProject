package java224.hw06ifElse;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random rand = new Random(); // генератор псевдослучайных чисел
		
		// одно целое случайное число от -4 до 3, не включая 3
		int num = rand.nextInt(-4, 3);
		System.out.printf("Одно случайное целое = %d\n\n", num);

		// 20 случайных чисел в диапазоне от 1 до 9 включительно
		long[] array = new long[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextLong(1, 10);
		}
		
		System.out.printf("Массив из %d-х случайных длинных целых чисел:\n", array.length);
		System.out.println(Arrays.toString(array));
	}
}
