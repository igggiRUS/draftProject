package java224.hw06ifElse;

public class App0303 {
	public static void main(String[] args) {
		// @ @ @ @ @
		// @ @ @ @
		// @ @ @
		// @ @
		// @
		
		
		// 0                 i   size
		final int size = 5;
		for (int i = 0; i < size; i++) {
			//for (int j = i; j < size; j++) {
			//for (int j = size; j > i; j--) {
			for (int j = 0; j < size - i; j++) {
				System.out.print("@ ");
			}
			
			System.out.print('\n');
		}
	}
}






