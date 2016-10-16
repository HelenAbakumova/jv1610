package basictypes;

public class Task04 {

	public static void main(String[] args) {
		// объем цилиндра
		int ro = 2;
		int h = 4;
		double v = Math.PI * (Math.pow(ro, 2)) * h;
		System.out.println("Oбъем цилиндра равен " + v);

		// объем полого цилиндра
		int r = 6;
		double vp = Math.PI * h * ((r * r) - (ro * ro));
		System.out.println("Объем полого цилиндра равен " + vp);
		// площадь боковой поверхности цилиндра (не полого)
		double sBok = 2 * Math.PI * r * h;
		System.out.println("Площадь боковой поверхности цилиндра равна " + sBok);
		// объем шара
		int dD = 6;
		double sharV = Math.PI * (dD * dD * dD) / 6;
		System.out.println("Объем шара равен " + sharV);
		// площадь поверхности шара
		double sharS = Math.PI * (dD * 2);
		System.out.println("Площадь поверхности шара равна " + sharS);
		// объем прямоугольного параллелепипеда
		int a = 3;
		int b = 6;
		int c = 4;
		int oPP = a * b * c;
		System.out.println("Oбъем  прямоугольного параллелепипеда равен " + oPP);
		// площадь поверхности прямоугольного параллелепипеда
		int pPP = 2 * ((a * b) + (b * c) + (a * c));
		System.out.println("Площадь  прямоугольного параллелепипеда равна " + pPP);
		// объем тетраэдра
		int re = 4;
		Math.sqrt(2);
		Math.pow(re, 3);
		System.out.println("Oбъем тетраэдра равeн " + Math.sqrt(2) / 12 * Math.pow(re, 3));

		// площадь поверхности тетраэдра
		Math.sqrt(3);
		Math.pow(re, 2);
		System.out.println("Площадь поверхности тетраэдра равна " + Math.sqrt(3) * Math.pow(re, 2));

	}
}

