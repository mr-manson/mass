package by.htp.les03.mas;

public class MasTask09 {

	public static void main(String[] args) {
		// 09. Даны действительные числа а 1 ,а 2 ,..., а n . Поменять местами
		// наибольший и наименьший элементы.
		int[] mas = new int[] { 10, 22, 31, 45, 15, 36 };
		int max = 0;
		int min = 0;
		int temp = 0;
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > mas[max]) {
				max = i;
			}
			if (mas[i] < mas[min]) {
				min = i;
			}
		}
		
		temp = mas[max];
		mas[max] = mas[min];
		mas[min] = temp;
		
		//System.out.println(temp + " " + max + " " + min);
		
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

	}

}
