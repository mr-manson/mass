package by.htp.les03.masmas;

public class MasMasTask09 {

	public static void main(String[] args) {

		// 09. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

		int[][] mas = new int[][] { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, { 5, 6, 7, 8 }, { 7, 8, 9, 0 } };

		masPrint(mas);
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					System.out.print(mas[i][j] + " ");
				}
			}
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