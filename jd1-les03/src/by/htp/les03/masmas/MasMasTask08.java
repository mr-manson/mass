package by.htp.les03.masmas;

public class MasMasTask08 {

	public static void main(String[] args) {

		// 08. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
		// число 7 среди элементов массива.

		int n = 5;
		int m = 5;
		int[][] mas = new int[n][m];
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 9);
			}
		}

		masPrint(mas);
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7) {
				count++;
				}
			}
		}
		System.out.println(count);

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