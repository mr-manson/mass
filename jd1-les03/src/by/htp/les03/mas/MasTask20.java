package by.htp.les03.mas;

public class MasTask20 {

	public static void main(String[] args) {
		int[] mas = new int[] { -10, 22, 31, 45, -10, 36 };

		for (int i = 0; i < mas.length; i++) {
			if (i % 2 == 0) {
				mas[i] = 0;
				System.out.print(mas[i] + " ");
			} else {
				System.out.print(mas[i] + " ");
			}
		}
	}
}
