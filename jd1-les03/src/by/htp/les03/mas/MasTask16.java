package by.htp.les03.mas;

public class MasTask16 {
	public static void main(String[] args) {
		// 16. Даны действительные числа n a ,a , ,a 1 2  . Найти max( , , , ).

		int[] mas = new int[] { -10, 22, 31, 45, 15, 36 };
		int max;
		int sum;
		
		max = mas[0] + mas[mas.length - 1];
		
		for (int i = 0; i < mas.length / 2; i++) {
			sum = mas[i] + mas[mas.length - i - 1];
			if (max < sum) {
				max = sum;
			}
		//	System.out.println(max);
		}
		System.out.println(max);
		
	}

}
