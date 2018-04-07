package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay(){
		return this.day;
	}
	public int getMonth(){
		return this.month;
	}
	
	public int getYear(){
		return this.year;
	}

	public boolean isSameYear(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
		//return this.year == another.getYear();
	}
	public boolean isSameYear(Date another){
		return this.year==another.getYear();



	}
	public boolean isSameMonth(Date another){
		if( this.month==another.getMonth()){
			return true;
		}

		return false;
	}
	public boolean isSameMonth(Date another){
		return this.month==another.getMonth();




	}
	public boolean isSameDay(Date another){
		if( this.day==another.getDay()){
			return true;
		}
		return false;
	}
	public boolean isSameDay(Date another){
		return this.day==another.getDay();


	}
	public boolean isSame(Date another){
		return this.year == another.getYear()&&
		 this.month == another.getMonth()&&
		 this.day == another.getDay();
	}
	public boolean isSame(Date another){
		if (( this.year == another.getYear() ) && (this.month==another.getMonth()) && (this.day==another.getDay()) {
			return true;
		}
		return false;
	}
			
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	


	public void  nameMonth(){ 
	
	switch(this.month){   //el valor del atributo del objeto que llame al metodo
	case 1:
		
		shownameMonth(1);
		
	break;







	}
	private void  shownameMonth(int month){ 
	
	switch(month){
	case 1:
		
		System.out.println("Mes: enero ");
		
	break;







	}
	







	public boolean isValidDay(){ 
	
	
	switch(this.month){
	
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		
		return this.day>=1 && this.day<=31;
		
	break;
	case 2:
		if (bisiesto())
		return this.day>=1 && this.day<=29;
	break;
	
	 case 4: case 6: case 9: case 11:
 		return this.day>=1 && this.day<=30
	break;
	





	}
	}
	private boolean bisiesto(){
		if (year%4==0)&&(year%100!=0)||(year%400==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String nameSeason(){
		String season;
	
	switch (this.month){
	case 12: case 1: case 2: case 3:
		season= "invierno";
	break;
	}
	}

	public String showMonths(){
		for(int i=getMonth(); i<=12; i++){
			shownameMonth(i);
		}


	}
	
	public void showDate(){
		System.out.println(toString());
	}
	public void showAllDate(){
		for(int i=getDay();i<=daysOfMonth(getMonth());i++){
			System.out.println("dia: "+i+"month: "+getMonth()+"year: 	"+getYear() ;
	}


}
	private int daysOfMonth(int month){
		switch(month){  //o getMonth()
	
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		
		return 31;
		
	break;
	case 2:
		if (bisiesto())
		return 29;
		else 
	break;
	
	 case 4: case 6: case 9: case 11:
 		return 30
	break;
	}
	
	public void sameDays(){
		switch(this.month){  //o getMonth()
	
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		
		System.out.println("Enero,Marzo,...");
		
	break;
	
	
	case 4: case 6: case 9: case 11:
 		s.o.p.
	break;
	}
	}
	
	public int numberOfDays(){
		int counter=0;


		for(int i=1; i<getMonth();i++){
			counter=counter+daysOfMonth(i);
		}
		counter=counter + getDay();
		return counter;
	}

			
			
			
	
	}	




	}
	
