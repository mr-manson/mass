package by.htp.les03.mas;

public class MasTask15 {
	public static void main(String[] args) {
		// 15. Дана последовательность действительных чисел n a ,a , ,a 1 2  . Указать
		// те ее элементы, которые принадлежат отрезку [с, d].

		int[] mas = new int[] { -10, 22, 31, 45, 15, 36 };
		int c = 10;
		int d = 40;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > c && mas[i] < d) {

				System.out.print(mas[i] + " ");
			}
		}
	}
}
