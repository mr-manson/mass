package by.htp.les03.mas;

public class MasTask11 {

	public static void main(String[] args) {
		// 11. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых
		// остаток от деления на М равен L (0 < L < М-1).
		int[] mas = new int[] { -10, 22, 31, 45, 15, 36 };
		int m = 3;

		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % m > 0) && (mas[i] % m < (m - 1))) {
				System.out.print(mas[i] + " ");
			}
		}
	}
}
