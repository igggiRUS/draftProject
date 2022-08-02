package java224.hw06ifElse;

public class App0505 {
	public static void main(String[] args) {
		// . . . . @
		// . . . @ @
		// . . @ @ @
		// . @ @ @ @
		// @ @ @ @ @

		final int size = 5;
        for (int i = 0; i < size; i++) {
        	for (int j = 0; j < size; j++) {
                //System.out.print(j < size - i - 1 ? ". " : "");
        		if (j < size - i - 1) {
                    System.out.print(". ");
        		} else {
                    System.out.print("@ ");
        		}
        	}
            System.out.print('\n');
        }
	}
}






