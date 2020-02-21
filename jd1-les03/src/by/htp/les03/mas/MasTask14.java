package by.htp.les03.mas;

public class MasTask14 {

	public static void main(String[] args) {
		// 14. Дан одномерный массив A[N]. Найти: max( , , , ) min( , , , )

		int[] mas = new int[] { -10, 22, 31, 45, 15, 36 };
		int max = mas[0];
		int min = mas[1];
		int sum;

		for (int i = 0; i < mas.length - 1; i += 2) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}

		for (int i = 1; i < mas.length - 1; i += 2) {
			if (min > mas[i]) {
				min = mas[i];
			}
		}

		sum = max + min;
		System.out.println(sum);
	}
}
