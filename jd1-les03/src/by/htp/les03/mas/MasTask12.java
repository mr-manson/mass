package by.htp.les03.mas;

public class MasTask12 {

	public static void main(String[] args) {
		// 12. «адана последовательность N вещественных чисел. ¬ычислить сумму чисел,
		// пор€дковые номера которых €вл€ютс€ простыми числами.

		int[] mas = new int[] { -10, 22, 31, 45, 15, 36 };
		int sum = 0;

		for (int i = 1; i < mas.length; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
				if (count <= 2) {
				sum += mas[i];
			}
		}
		System.out.println(sum);
	}
}
