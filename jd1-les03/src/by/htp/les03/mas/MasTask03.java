package by.htp.les03.mas;

public class MasTask03 {

	public static void main(String[] args) {
		// 03. Дана последовательность целых чисел а 1 а 2 ,..., а n . Выяснить, какое
		// число встречается раньше - положительное или отрицательное.

		int[] mas = new int[] { -10, 22, 31, 45, 15, 36 };

		if (mas[0] < 0) {
			System.out.println("Отрицательное число встречается раньше");
		} else {
			System.out.println("Положительное число встречается раньше");
		}
	}
}
