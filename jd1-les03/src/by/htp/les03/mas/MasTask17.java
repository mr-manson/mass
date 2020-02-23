package by.htp.les03.mas;

public class MasTask17 {
	public static void main(String[] args) {
		// 17. Дана последовательность целых чисел a a a. Образовать новую
		// последовательность, выбросив из исходной те члены, которые равны min(aaa).

		int[] mas = new int[] { -10, 22, 31, 45, -10, 36 };
		int min = mas[0];

		for (int i = 1; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
			}
		}
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] != min) {
				System.out.print(mas[i] + " ");
			}
		}
	}

}
