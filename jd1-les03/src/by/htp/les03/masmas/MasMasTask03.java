package by.htp.les03.masmas;

public class MasMasTask03 {

	public static void main(String[] args) {

		// 03. Дана матрица. Вывести на экран первый и последний столбцы.

		int[][] mas = new int[][] { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, { 5, 6, 7, 8 }, { 7, 8, 9, 0 } };

		masPrint(mas);
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == 0 || j == mas[i].length - 1) {
					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println();

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