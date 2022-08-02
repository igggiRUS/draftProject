package java224.hw06ifElse;

public class App0606 {
	public static void main(String[] args) {
		// 0: . . . . . @
		// 1: . . . . @ @
		// 2: . . . @ _ @
		// 3: . . @ _ _ @
		// 4: . @ _ _ _ @
		// 5: @ @ @ @ @ @

		final int size = 10;

		for (int j = 1; j < size; j++) {
			System.out.print(". ");
		}
		System.out.print("@ \n");
		
		for (int i = 1; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				System.out.print(". ");
			}
			
			System.out.print("@ ");
			for (int j = 1; j <= i - 1; j++) {
				System.out.print("_ ");
			}
			System.out.print("@ \n");
		}
		
		for (int j = 0; j < size; j++) {
			System.out.print("@ ");
		}
		System.out.print('\n');
	}
}

