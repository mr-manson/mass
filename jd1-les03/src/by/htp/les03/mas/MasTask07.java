package by.htp.les03.mas;

public class MasTask07 {

	public static void main(String[] args) {
		// 07. Дана последовательность действительных чисел а 1 ,а 2 ,..., а п .
		// Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество
		// замен.
		
		int[] mas = new int[] { 2, 7, 3, 5, 1, 6, 9 };
		int z = 5;
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
				count++;
			}
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		System.out.println("Количество замен - " + count);
	}
}
