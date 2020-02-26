package by.htp.les03.masmas;

public class MasMasTask25 {

	public static void main(String[] args) {

		// 25. Получить квадратную матрицу порядка n:

		int n = 6;
		int[][] mas = new int[n][n];
		int x = 1;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = x;
				x++;
				System.out.printf("%5d", mas[i][j]);
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
