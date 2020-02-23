package by.htp.les03.masmas;

public class MasMasTask06 {

	public static void main(String[] args) {

		// 06. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
		// элемент больше последнего.

		int[][] mas = new int[][] { { 1, 2, 3, 4 }, { 9, 4, 5, 6 }, { 5, 6, 7, 8 }, { 7, 8, 9, 9 } };

		masPrint(mas);
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 != 0 && mas[i][0] > mas[i][mas.length - 1]) {
				for (int j = 0; j < mas[i].length; j++) {
					System.out.print(mas[i][j] + " ");
				}
			}
			if (i % 2 != 0 && mas[i][0] > mas[i][mas.length - 1]) {
				System.out.println();
			} else {
				continue;
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