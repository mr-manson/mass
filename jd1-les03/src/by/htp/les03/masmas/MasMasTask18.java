package by.htp.les03.masmas;

public class MasMasTask18 {

	public static void main(String[] args) {

		// 18. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 6;
		int[][] mas = new int[n][n];
		int x = 1;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = x;
				System.out.print(mas[i][j] + " ");
			}
			x++;
			System.out.println();
		}
	}
}