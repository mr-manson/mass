package by.htp.les03.masmas;

public class MasMasTask23 {

	public static void main(String[] args) {

		// 23. Сформировать квадратную матрицу порядка N по правилу:
		// и подсчитать количество положительных элементов в ней.

		int n = 6;
		double[][] mas = new double[n][n];
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = Math.sin((i * i - j * j) / n);
				if (mas[i][j] > 0) {
					count++;
				}

				System.out.printf("%7.2f", mas[i][j]);
			}

			System.out.println();
			
		}
		System.out.println();
		System.out.println("Количество положительных элементов матрицы - " + count);
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
