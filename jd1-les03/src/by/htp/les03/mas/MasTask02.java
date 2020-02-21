package by.htp.les03.mas;

public class MasTask02 {
	
	public static void main(String[] args) {

		// 02. В целочисленной последовательности есть нулевые элементы. Создать массив
		// из номеров этих элементов.
		int[] mas = new int[] { 0, 22, 0, 45, 0, 36 };
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				count++;
			}
		}

		int[] masZero = new int[count];
		int j = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				masZero[j] = i;
				System.out.print(masZero[j] + " ");
				j++;
			}
		}
	}
}
