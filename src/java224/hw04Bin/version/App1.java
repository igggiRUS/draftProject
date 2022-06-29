package java224.hw04Bin.version;

import java.util.Scanner;

public class App1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 14 = 8 + 4 + 2
		// 14 = 2**3 + 2**2 + 2**1
		// 1110
		
		// 1100 -> 0 * 2**0 + 0 * 2**1 + 1 * 2**2 + 1 * 2**3
		// 1100 -> 4 + 8 -> 12

		int num = 0b10101100; // 32 bit
		//int num = 0xFFFFFFFF; // 32 bit
		// 00000000_00000000_00000000_00001100
		System.out.printf("%3d -> %32s\n", num, Integer.toBinaryString(num));
		
		//   10101100
		// & 00001000
		//   --------
		//   00001000

		System.out.print("Введите номер дня: ");
		int day = sc.nextInt();

		//   10101100
		// | 00000010
		//   --------
		//   10101110
		int result = num | (1 << day);

		// int result = (num >> day) & 1;
		String binResult = Integer.toBinaryString(result);
		System.out.printf("%3d -> %32s\n", result, binResult);
		
		sc.close();
	}
}
