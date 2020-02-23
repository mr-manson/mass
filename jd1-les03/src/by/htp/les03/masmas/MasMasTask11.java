package by.htp.les03.masmas;

public class MasMasTask11 {

	public static void main(String[] args) {

		// 11. Дана матрица размера m x n. Вывести ее элементы в следующем порядке:
		// первая строка справа налево, вторая строка слева направо, третья строка
		// справа налево и так далее.

		int[][] mas = new int[][] { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, { 5, 6, 7, 8 }, { 7, 8, 9, 0 } };

		masPrint(mas);
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < mas[i].length; j++) {
					System.out.print(mas[i][j] + " ");
				}
				System.out.println();
			} else if (i % 2 != 0) {
				for (int j = mas[i].length - 1; j >= 0; j--) {
					System.out.print(mas[i][j] + " ");
				}
				System.out.println();
			}

		}
		System.out.println();

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