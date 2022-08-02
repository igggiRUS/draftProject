package java224.hw06ifElse;

public class App0101 {
	public static void main(String[] args) {
		int size = 20;
		int r = size / 2;
		for (int y = 0; y <= size; y++) {
			for (int x = 0; x <= size; x++) {
				int dx = x;
				int dy = y;
				if (dx * dx + dy * dy <= r * r) {
					System.out.print("@ ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
	}
}
