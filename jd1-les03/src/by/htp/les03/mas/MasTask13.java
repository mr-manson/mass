package by.htp.les03.mas;

public class MasTask13 {

	public static void main(String[] args) {
		// 13. Определить количество элементов последовательности натуральных чисел,
		// кратных числу М и заключенных в промежутке от L до N.

		int[] mas = new int[] { -10, 22, 31, 45, 15, 36 };
		int m = 3;
		int l = 10;
		int n = 40;
		int count = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % m == 0 && mas[i] > l && mas[i] < n) {
				count++;
			}
		}
		System.out.println(count);

	}

}
