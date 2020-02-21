package by.htp.les03.mas;

public class MasTask05 {

	public static void main(String[] args) {
		// 05. Дана последовательность натуральных чисел а 1 , а 2 ,..., а п . Создать
		// массив из четных чисел этой последовательности. Если таких чисел нет, то
		// вывести сообщение об этом факте.

		int[] mas = new int[] { -10, 22, 31, 45, 15, 36 };
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				count++;
			}
		}

		if (count != 0) {
			int[] masEven = new int[count];
			int j = 0;
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] % 2 == 0) {
					masEven[j] = mas[i];
					System.out.print(masEven[j] + " ");
					j++;
				}
			}
		} else {
			System.out.println("Четных чисел нет");
		}

	}

}
