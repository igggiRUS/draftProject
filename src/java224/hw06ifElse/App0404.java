package java224.hw06ifElse;

public class App0404 {
	public static void main(String[] args) {
		// @
		// @ @
		// @ @ @
		// @ @ @ @
		// @ @ @ @ @

		// . . . . .
		// . . . .
		// . . .
		// . .
		// .

		// . . . . @
		// . . . @ @
		// . . @ @ @
		// . @ @ @ @
		// @ @ @ @ @

		
		// 0                 i   size
		final int size = 5;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				System.out.print(". ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("@ ");
			}
			
			System.out.print('\n');
		}
	}
}






