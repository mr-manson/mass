package by.htp.les03.masmas;

public class MasMasTask16 {

	public static void main(String[] args) {

		// 16. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 6;
		int[][] mas = new int[n][n];
		int x = 1;
		int y = 2;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = x * y;
					x++;
					y++;
				} else {
					mas[i][j] = 0;
				}
				System.out.printf("%4s", mas[i][j]);
			}
			System.out.println();
		}
	}
}