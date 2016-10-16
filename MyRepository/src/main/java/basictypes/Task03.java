package basictypes;

public class Task03 {
	// вычислить длинну окружности
		public static void main(String[] args) {
			int d = 4;
			double c = Math.PI * d;
			System.out.println("Длинна окружности равна " + c + "см");
			// площадь окружности
			int ro = 2;
			double so = Math.PI * (ro * 2);
			System.out.println("Площадь окружности равна " + so + "см");

			// площадь кольца
			int r = 6;
			double sk = Math.PI * ((r * 2) - (ro * 2));
			System.out.println("Площадь кольца равна " + sk + "см");

			// периметр треугольника
			byte a = 6;
			byte b = 4;
			byte g = 7;
			int p = a + b + g;
			System.out.println("Периметр треугольника равен " + p + " см");

			// площадь треугольника
			int h = 5;
			int triangleS = (b * h) / 2;
			System.out.println("Площадь треугольника равна " + triangleS + " см");
			// периметр прямоугольника
			int rectangleP = 2 * (a + b);
			System.out.println("Периметр прямоугольника равен " + rectangleP + " см");
			// площадь прямоугольника
			int rectangleS = a * b;
			System.out.println("Площадь прямоугольника равна " + rectangleS + " см");

		}

}
