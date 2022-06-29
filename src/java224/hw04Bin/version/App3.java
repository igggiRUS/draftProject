package java224.hw04Bin.version;

public class App3 {
	public static void main(String[] args) {
		int num = 0b10101100; // 32 bit
		System.out.printf("%5d -> %32s\n", num, Integer.toBinaryString(num));

		int day = 4;
		
		int result = num ^ (1 << day);
		String binResult = Integer.toBinaryString(result);
		System.out.printf("%5d -> %32s\n", result, binResult);

		result = num & ~(1 << day);
		binResult = Integer.toBinaryString(result);
		System.out.printf("%5d -> %32s\n", result, binResult);
	}
}
