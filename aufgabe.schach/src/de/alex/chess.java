package de.alex;

public class chess {
	public static void main(String[] args) {

		int arrays = 8;
		int numbersPerArray = 8;

		String[][] chess = new String[arrays][numbersPerArray];

		int randomnumber = (int) Math.floor(Math.random() * 11);

		int i = 0;
		int a = 0;
		String even = "#";
		String notEven = " ";

		int b = 0;
		int c = 0;
		int fl = 0;
		int ll = 7;

		while (i < arrays) {
			if (i % 2 == 0) {
				while (a < numbersPerArray) {
					if (a % 2 == 0) {
						chess[i][a] = notEven;
						a++;
					} else {
						chess[i][a] = even;
						a++;
					}
				}
				i++;
				a = 0;
			} else {
				while (a < numbersPerArray) {
					if (a % 2 == 0) {

						chess[i][a] = even;
						a++;
					} else {

						chess[i][a] = notEven;
						a++;
					}
				}
				i++;
				a = 0;
			}

		}

		while (b < chess.length) {
			place(chess, fl, ll);
			while (c < chess[b].length) {
				System.out.print(chess[b][c] + " ");
				c++;
			}
			System.out.println();
			b++;
			c = 0;

		}
	}

	static void place(String[][] chess, int fl, int ll) {

		int i = 0;
		while (i < 8) {
			if (i == 0 | i == 7) {
				chess[fl][i] = "R";
				chess[ll][i] = "R";
			} else if (i == 1 | i == 6) {
				chess[fl][i] = "L";
				chess[ll][i] = "L";
			} else if (i == 2 | i == 5) {
				chess[fl][i] = "B";
				chess[ll][i] = "B";
			} else if (i == 3) {
				chess[fl][i] = "D";
				chess[ll][i] = "D";
			} else {
				chess[fl][i] = "K";
				chess[ll][i] = "K";
			}
			i++;
		}

	}

}
