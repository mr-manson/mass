package by.htp.les03.masmas;

public class MasMasTask17 {

	public static void main(String[] args) {

		// 17. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

		int n = 6;
		int[][] mas = new int[n][n];
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == 0 || i == mas.length - 1 || j == 0 || j == mas.length - 1) {
					mas[i][j] = 1;
				} else {
					mas[i][j] = 0;
				}
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
}