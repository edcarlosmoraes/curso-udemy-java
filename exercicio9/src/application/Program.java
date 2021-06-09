package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int lin = sc.nextInt();
		int col = sc.nextInt();
		int[][] mat = new int[lin][col];

		for (int i = 0; i < lin; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int n = sc.nextInt();

		for (int i = 0; i < lin; i++) {
			for (int j = 0; j < col; j++) {
				if (mat[i][j] == n) {
					System.out.println("Position: " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (j <= (col - 2)) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (i <= (lin - 2)) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
