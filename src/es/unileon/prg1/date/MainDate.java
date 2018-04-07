package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		today = new Date(20, 3, 2018);
		tomorrow = new Date(21, 3, 2018);
		System.out.println(today.toString() + " isSameYear " + tomorrow.toString() + "? " + today.isSameYear(tomorrow));
		System.out.println(today.toString() + " isSameMonth " + tomorrow.toString() + " ? " + today.isSameMonth(tomorrow));
		System.out.println(today.toString() + " isSameDay " + tomorrow.toString() + "? " + today.isSameDay(tomorrow));

		today.nameMonth();
	
		System.out.println(" isValidDay " + " ? " + today.isValidDay());
		today.showMonths();
		today.showDate();


}
