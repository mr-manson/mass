package by.htp.les03.masmas;

public class MasMasTask01 {

	public static void main(String[] args) {

		// 01. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной
		// строке была ровно одна единица, и вывести на экран.

		int[][] mas = new int[3][4];
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == 0) {
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