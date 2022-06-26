package hw04inary;

public class binDecimalBinary {
	public static void main(String[] args) {
		int a = 0b0100;
		System.out.printf("%d -> %32s\n", a, Integer.toBinaryString(a));
		int b = 0b1100;
		System.out.printf("%d -> %32s\n", b, Integer.toBinaryString(b));
		int result1 = a & b;
		System.out.printf("%d & %d %d\n", a, b, result1);

		int result2 = 0b0100 & 0b1100;
		System.out.printf("%d & %d %d\n", a, b, result1);

		int zeroBit = 32;
		String str = "0";
		System.out.println("положительное десятичное число:  " + a);
		System.out.println(
				"отрицательное десятичное число: " + (Integer.parseUnsignedInt(Integer.toBinaryString(~a), 2) + 1));
		System.out.println();
		System.out.println("положительное: " + str.repeat((zeroBit - (Integer.toBinaryString(a)).length())) + ""
				+ Integer.toBinaryString(a));
		System.out.println("отрицательное: " + Integer.toBinaryString(~a));
		System.out.println("положительное десятичное число:  " + b);
		System.out.println(
				"отрицательное десятичное число: " + (Integer.parseUnsignedInt(Integer.toBinaryString(~b), 2) + 1));
		System.out.println();
		System.out.println("положительное: " + str.repeat((zeroBit - (Integer.toBinaryString(b)).length())) + ""
				+ Integer.toBinaryString(b));
		System.out.println("отрицательное: " + Integer.toBinaryString(~b));
		System.out.println();
	}
}
