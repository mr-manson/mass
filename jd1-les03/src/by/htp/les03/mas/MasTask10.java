package by.htp.les03.mas;

public class MasTask10 {

	public static void main(String[] args) {
		// 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
		// которых аi > i.
		int[] mas = new int[] { -1, 2, 1, 5, 6, 3 };

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.print(mas[i] + " ");
			}
		}
	}
}
