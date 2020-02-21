package by.htp.les03.mas;

public class MasTask08 {

	public static void main(String[] args) {
		// 08. Дан массив действительных чисел, размерность которого N. Подсчитать,
		// сколько в нем отрицательных, положительных и нулевых элементов.

		int[] mas = new int[] { -10, 22, 0, 45, -15, 36 };
		int countPositive = 0;
		int countNegative = 0;
		int countZero = 0;

		System.out.println("В массиве:");

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				countPositive++;
			}
		}
		if (countPositive == 0) {
			System.out.println("- положительных элементов - нет");
		} else {
			System.out.println("- положительных элементов - " + countPositive);
		}

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				countNegative++;
			}
		}
		if (countPositive == 0) {
			System.out.println("- отрицательных элементов - нет");
		} else {
			System.out.println("- отрицательных элементов - " + countNegative);
		}
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				countZero++;
			}
		}
		if (countZero == 0) {
			System.out.println("- нулевых элементов - нет");
		} else {
			System.out.println("- нулевых элементов - " + countZero);
		}
		

	}

}
