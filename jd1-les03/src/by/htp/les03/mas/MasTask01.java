package by.htp.les03.mas;

public class MasTask01 {

	public static void main(String[] args) {

		// 01. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
		// которые кратны данному К.
		int[] mas = new int[] { 10, 22, 31, 45, 15, 36 };
		int k = 3;
		int sum = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum += mas[i];
			}
		}
		System.out.println(sum);
	}
}