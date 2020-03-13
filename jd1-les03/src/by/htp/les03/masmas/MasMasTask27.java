package by.htp.les03.masmas;

import java.util.Scanner;

public class MasMasTask27 {

	public static void main(String[] args) {

		// 27. В числовой матрице поменять местами два столбца любых столбца, т. е. все
		// элементы одного столбца поставить на соответствующие им позиции другого, а
		// его элементы второго переместить в первый. Номера столбцов вводит
		// пользователь с клавиатуры.

		int n = 5;
		int k;
		int l;
		int temp;
		int c = 0;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 10);
			}
		}

		masPrint(mas);
		System.out.println("");

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номера двух столбцов от 1 до " + n);
		k = sc.nextInt() - 1;
		l = sc.nextInt() - 1;
		sc.close();

		for (int i = 0; i < mas.length; i++) {
			if (k > (n - 1) || l > (n - 1) || k <= 0 || l <= 0) {
				c++;
				System.out.println("Неверный номер");
				break;
			} else {
				temp = mas[i][k];
				mas[i][k] = mas[i][l];
				mas[i][l] = temp;
			}
		}
		if (c == 0) {
			masPrint(mas);
		}
	}

	public static void masPrint(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
