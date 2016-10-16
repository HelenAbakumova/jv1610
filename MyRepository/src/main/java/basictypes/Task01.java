package basictypes;

public class Task01 {
	public static void main(String[] args) {

		String fio = "Абакумова Елена Владимировна";
		String number = "JV 16-10";
		double time1 = 19.00;
		double time2 = 9.00;
		System.out.println("ФИО: " + fio);
		System.out.println("Номер группы: " + number);
		System.out.printf("Время занятий: " + "Среда %.2f\n", time1);
		System.out.println("Время занятий: " + "Воскресенье " + time2 + "0");
	}

}
