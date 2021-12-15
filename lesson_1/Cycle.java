public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		int number = 6;
		while(number >= -6) {
			System.out.print(number + " ");
			number -= 2;
		}

		System.out.println();

		number = 10;
		int result = 0;
		do {
			if (number % 2 != 0) {
				result += number;
			}

			number++;

		} while(number < 20);

		System.out.println(result);
	}
}