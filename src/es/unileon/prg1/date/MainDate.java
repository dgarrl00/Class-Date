package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		
		today = new Date(20, 3, 2018);
		tomorrow = new Date(21, 3, 2018);
		System.out.println(today.toString() + " isSameYear " + tomorrow.toString() + "? " + today.isSameYear1(tomorrow));
		System.out.println(today.toString() + " isSameMonth " + tomorrow.toString() + " ? " + today.isSameMonth1(tomorrow));
		System.out.println(today.toString() + " isSameDay " + tomorrow.toString() + "? " + today.isSameDay1(tomorrow));
		System.out.println(today.toString() + " isSame " + tomorrow.toString() + " ? " + today.isSame1(tomorrow));

		today.nameMonth();
		today.nameSeason();
	
		System.out.println(" isValidDay " + " ? " + today.isValidDay());
		today.showMonths();
		today.showDate();
		today.showAllDate();
		today.sameDays();
		today.numberOfDays();
		System.out.println(today.numberOfAttemps1());
		System.out.println(today.numberOfAttemps2());
		System.out.println(today.whatDayIs(2));
	}


}
