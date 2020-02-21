package by.htp.les03.mas;

public class MasTask06 {

	public static void main(String[] args) {
		// 06. Дана последовательность чисел а 1 ,а 2 ,..., а п . Указать наименьшую
		// длину числовой оси, содержащую все эти числа.
		
		int[] mas = new int[] { 1, 2, 3, 4, 5, 6, 1, 3, 5 };
		int max = mas[0];
		
		for (int i = 1; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}
		System.out.println(max);

	}

}
