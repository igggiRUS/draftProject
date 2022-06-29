package java224.hw04Binary;

public class infoBin {
	public static void main(String[] args) {
		int aBin = 0b0100;
		System.out.printf("%3d -> %32s\n", aBin, Integer.toBinaryString(aBin));
		int bBin = 0b1100;
		System.out.printf("%3d -> %32s\n", bBin, Integer.toBinaryString(bBin));
		int result1 = aBin & bBin;
		System.out.printf("%d & %d %d\n", aBin, bBin, result1);

		int result2 = 0b0100 & 0b1100;
		System.out.printf("%d & %d %d\n", aBin, bBin, result1);

		int zeroBit = 32;
		String str = "0";
		System.out.println("положительное десятичное число:  " + aBin);
		System.out.println(
				"отрицательное десятичное число: " + (Integer.parseUnsignedInt(Integer.toBinaryString(~aBin), 2) + 1));
		System.out.println();
		System.out.println("положительное: " + str.repeat((zeroBit - (Integer.toBinaryString(aBin)).length())) + ""
				+ Integer.toBinaryString(aBin));
		System.out.println("отрицательное: " + Integer.toBinaryString(~aBin));
		System.out.println("положительное десятичное число:  " + bBin);
		System.out.println(
				"отрицательное десятичное число: " + (Integer.parseUnsignedInt(Integer.toBinaryString(~bBin), 2) + 1));
		System.out.println();
		System.out.println("положительное: " + str.repeat((zeroBit - (Integer.toBinaryString(bBin)).length())) + ""
				+ Integer.toBinaryString(bBin));
		System.out.println("отрицательное: " + Integer.toBinaryString(~bBin));
		System.out.println();
	}
}
