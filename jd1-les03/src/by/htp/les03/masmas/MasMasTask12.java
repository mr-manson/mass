package by.htp.les03.masmas;

public class MasMasTask12 {

	public static void main(String[] args) {

		// 12. Получить квадратную матрицу порядка n:

		int n = 6;
		int[][] mas = new int[n][n];
		int x = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = x;
					x++;
				} else {
					mas[i][j] = 0;
				}
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
}