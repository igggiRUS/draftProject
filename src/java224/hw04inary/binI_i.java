package java224.hw04inary;

public class binI_i {
	public static void main(String[] args) {

		int bin = 0b0101010101010101010;
//		побитовое И
		int resultBinI = bin & 0b1000000;
//		Побитовое ИЛИ
		int resultBinIli = bin | 0b1000000;
		
		/**
		 * побитовое &
		 * если находит в bin если единица с права попадает на единицу с лева то появляется цифра 1
		 * 
		 * 01010_1010_1010_1010 &
		 * 11111_1111_1111_1111 =
		 * 01010_1010_1010_1010
		 */
		
		System.out.printf("%3d -> %32s\n", resultBinI, Integer.toBinaryString(resultBinI));
		System.out.printf("%3d -> %32s\n", resultBinIli, Integer.toBinaryString(resultBinIli));

	}
}
