package java224.hw04Bin.version;

public class App2 {
	public static void main(String[] args) {
		// 00000101
		int num = 0b01000000_00000000_00000000_00000000;
		String binNum = Integer.toBinaryString(num);
		System.out.printf("%12d -> %32s\n", num, binNum);
		
		// 11111111 11111111 11111111 11111011
		// 00000000 00000000 00000000 00000100 + 1
		// 00000000 00000000 00000000 00000101
		
		// 01000000_00000000_00000000_10000011
		// 00000000_00000000_00000000_00001100
		int res = num >> 2;
		String binRes = Integer.toBinaryString(res);
		System.out.printf("%12d -> %32s\n", res, binRes);
	}
}
