package by.htp.les03.mas;

public class MasTask04 {

	public static void main(String[] args) {
		// 04. Дана последовательность действительных чисел а 1 а 2 ,..., а n .
		// Выяснить, будет ли она возрастающей.

		int[] mas = new int[] { -10, 2, 31, 45, 50, 60 };
		int count = 0;

		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] < mas[i + 1]) {
				count++;
			}
		}

		if (count == mas.length - 1) {
			System.out.println("Последовательность возрастающая");
		} else {
			System.out.println("Последовательность рандомная");
		}
	}

}