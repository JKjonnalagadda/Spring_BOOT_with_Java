import java.util.Scanner;

class WAP {

	void WAP0(int n) {
		for (int i = 0; i < n; i++) {
			// I
			for (int j = 0; j < n; j++) {

				if (i == 0 || i == n - 1 || j == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");

			// N

			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			// E

			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || i == (n - 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");

			// U

			for (int j = 0; j < n; j++) {
				if (j == 0 || j == (n - 1) || i == (n - 1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			// R
			for (int j = 0; j < n; j++) {
				if (j == 0 && i >= 0 || i == n / 2 && j >= 0 || i == 0 && j >= 0 || j == n - 1 && i <= n / 2
						|| i >= n / 2 && i == j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			// O

			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == n - 1 || i == 0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("  ");
			// N

			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("  ");

		}

	}

	void WAP1() {
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {
				// for the next above quarter part
				System.out.print(i);

				System.out.print("  ");
			}
			System.out.println(" ");
		}
	}

	void WAP2(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i + j <= (n - 1) / 2 || // for the first quarter part
						i == 0 || j == 0 || i == (n - 1) || j == (n - 1) || // for borders
						j - i >= (n - 1) / 2) // for the next above quarter part
					System.out.print("& ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
	}

	void WAP3(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i - j >= (n - 1) / 2 || // for the first quarter part

						i + j >= (n - 1) + (n - 1) / 2) // for the next above quarter part
					System.out.print("& ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
	}

	void WAP4(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i - j >= (n - 1) / 2 || i + j <= (n - 1) / 2 || i == 0 || i == (n - 1))

					System.out.print("& ");
				else
					System.out.print("  ");
			}
			System.out.println(" ");
		}
	}

}

public class week1 {
	public static void main(String[] a) {
		Scanner number = new Scanner(System.in);
		System.out.print("Please enter the Input value:");
		int n = number.nextInt();   // for taking input from the console
									// and ideally for these patterns we can take 14.

		// int n= 14;

		WAP obj = new WAP();

		obj.WAP0(n);
		System.out.println(" INEURON PRINTING PATTERN" + '\n');

		obj.WAP1();
		System.out.println(" NUMBER PRINTING PATTERN" + '\n');

		obj.WAP2(n);
		System.out.println(" THIRD PRINTING PATTERN" + '\n');

		obj.WAP3(n);
		System.out.println(" FOURTH PRINTING PATTERN" + '\n');

		obj.WAP4(n);
		System.out.println(" FIFTH PRINTING PATTERN" + '\n');

	}
	//Please suggest any chance of optimization in my code and areas to work on.
}


