package by.htp.les03.masmas;

public class MasMasTask24 {

	public static void main(String[] args) {

		// 24. Дан линейный массив x x x x , , , , . Получить действительную квадратную
		// матрицу порядка n:

		int[] mas1 = { 1, 2, 3, 4, 5, 6 };
		int[][] mas2 = new int[6][6];

		for (int i = 0; i < mas2.length; i++) {

			for (int j = 0; j < mas2[i].length; j++) {
				mas2[i][j] = (int) (Math.pow(mas1[j], i + 1));

				System.out.printf("%7d", mas2[i][j]);
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
