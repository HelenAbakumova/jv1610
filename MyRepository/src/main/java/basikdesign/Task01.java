package basikdesign;

public class Task01 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				a = a + i;
				System.out.println("Кратно 2: " + i);
			}
			
			if (i % 3 == 0) {
				b = b + i;
				System.out.println("Кратно 3: " + i);
			}
			if (i % 5 == 0) {
				c = c + i;
				System.out.println("Кратно 5: " + i);
			}
			if (i % 7 == 0) {
				d = d + i;
				System.out.println("Кратно 7: " + i);
			}
		}
		System.out.println("Сумма парных чисел: "+ a);
		System.out.println("Сумма чисел, кратных 3: "+ b);
		System.out.println("Сумма чисел, кратных 5: "+ c);
		System.out.println("Сумма чисел, кратных 7: "+ d);
		System.out.println("Разность сумм последовательности чисел, кратных 7 и 2: " + (a - d));
		System.out.println("Отношение последовательности чисел, кратных 5 к последовательности чисел, кратных 3: "+ ((double) c / b));
	}

}
