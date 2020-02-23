package by.htp.les03.masmas;

public class MasMasTask07 {

	public static void main(String[] args) {

		// 07. Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.

		int[][] mas = new int[5][5];
		int sum = 0;
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = -5 + (int)(Math.random()*10);
				}
			}
		
		masPrint(mas);
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j % 2 != 0 && mas[i][j] < 0) {
					sum += Math.abs(mas[i][j]);
				}
			}
		}
		System.out.println(sum);
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