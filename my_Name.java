//Since this code will print my entire name -- JAYAKRISHNA
public class my_Name {

	public static void main(String[] a) {
		int n = 7;

		for (int i = 0; i < n; i++) {

			// J
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == (n - 1) / 2 || j == 0 && i > (n - 1) / 2 || i == n - 1 && j < (n - 1) / 2)
					System.out.print("& ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// A
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == (n - 1) / 2 || j == (n - 1))
					System.out.print("$ ");
				else
					System.out.print("  ");
			}
			System.out.print("");

			// Y

			for (int j = 0; j < n; j++) {
				if (j >= 0 && i == j && i <= (n - 1) / 2 || j >= 0 && i + j == n - 1 && i <= (n - 1) / 2
						|| j == (n - 1) / 2 && i > (n - 1) / 2)
					System.out.print("& ");
				else
					System.out.print("  ");
			}
			System.out.print("");

			// A
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == (n - 1) / 2 || j == (n - 1))
					System.out.print("& ");
				else
					System.out.print("  ");
			}
			System.out.print("");

			// K

			for (int j = 0; j < n; j++) {
				if (i >= 0 && j == (n - 1) / 2 || i == j && j > n / 2 || i + j == n - 1 && i < 3 * (n / 4))
					System.out.print("& ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// R

			for (int j = 0; j < n; j++) {
				if (j == 0 && i >= 0 || i == n / 2 && j >= 0 || i == 0 && j >= 0 || j == n - 1 && i <= n / 2
						|| i >= n / 2 && i == j)
					System.out.print("& ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");
			// I

			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == (n - 1) / 2)
					System.out.print("& ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");
			// S

			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 && i < n / 2 || i == (n - 1) / 2 || i == (n - 1)
						|| j == (n - 1) && i > (n - 1) / 2)
					System.out.print("& ");
				else
					System.out.print("  ");
			}
			System.out.print(" ");

			// H

			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == (n - 1) / 2)
					System.out.print("& ");
				else
					System.out.print("  ");
			}
			System.out.print("");

			// N

			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j)
					System.out.print("& ");
				else
					System.out.print("  ");
			}
			System.out.print("");
			// A
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == (n - 1) / 2 || j == (n - 1))
					System.out.print("& ");
				else
					System.out.print("  ");
			}
			System.out.println("");

		}

	}

}
