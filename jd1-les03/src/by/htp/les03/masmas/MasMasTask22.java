package by.htp.les03.masmas;

public class MasMasTask22 {

	public static void main(String[] args) {

		// 22. Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):

		int n = 6;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			int x = 1;
			for (int j = 0; j < mas[i].length; j++) {
				if ((j <= i) && (j + i <= mas.length - 1) || (j >= i) && (j + i <= mas.length - 1)) {
					mas[i][j] = x + i;
					x++;
				} else {
					mas[i][j] = 0;
				}

				System.out.print(mas[i][j] + " ");
			}
			x--;
			System.out.println();
		}

	}
}
