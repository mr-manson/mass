package by.htp.les03.mas;

public class MasTask20 {
	public static void main(String[] args) {
		// 20. Дан целочисленный массив с количеством элементов п. Сжать массив,
		// выбросив из него каждый второй элемент (освободившиеся элементы заполнить
		// нулями). Примечание. Дополнительный массив не использовать.

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
