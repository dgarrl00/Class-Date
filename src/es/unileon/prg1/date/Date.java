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
		if (( this.year == another.getYear() ) && (this.month==another.getMonth()) && (this.day==another.getDay())) {
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
	case 2:
		showNameMonth(2);
	break;
	case 3: 
		showNameMonth(3);
	break;
	case 4:
		showNameMonth(4);
	break;
	case 5: 
		showNameMonth(5);
	break;
	case 6: 
		showNameMonth(6);
	break;
	case 7: 
		showNameMonth(7);
	break;
	case 8: 
		showNameMonth(8);
	break;
	case 9: 
		showNameMonth(9);
	break;
	case 10: 
		showNameMonth(10);
	break;
	case 11: 
		showNameMonth(11);
	break;
	case 12: 
		showNameMonth(12);
	break;
	}
	







	}
	private void  shownameMonth(int month){ 
	
	switch(month){
	case 1:
		
		System.out.println("Mes: Enero ");
		
	break;
	case 2:
		System.out.println("Mes: Febrero ");
	break;
	case 3:
		System.out.println("Mes: Marzo ");
	break;
	case 4:
		System.out.println("Mes: Abril ");
	break;
	case 5: 
		System.out.println("Mes: Mayo ");
	case 6:
		System.out.println("Mes: Junio ");
	break;
	case 7:
		System.out.println("Mes: Julio ");
	break;
	case 8:
		System.out.println("Mes: Agosto ");
	break;
	case 9:
		System.out.println("Mes: Septiembre ");
	break;
	case 10:
		System.out.println("Mes: Octubre ");
	break;
	case 11:
		System.out.println("Mes: Noviembre ");
	break;
	case 12:
		System.out.println("Mes: Diciembre ");
	break;
	}

	







	}
	







	public boolean isValidDay(){ 
	
	
	switch(this.month){
	
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		
		return this.day>=1 && this.day<=31;
		
	break;
	case 2:
		if (bisiesto()){
			return this.day>=1 && this.day<=29;
		}
		else{
			return this.day>=1 && this.day<=28;
		}
		
	break;
	
	 case 4: case 6: case 9: case 11:
 		return this.day>=1 && this.day<=30;
	break;
	





	}
	}
	private boolean bisiesto(){
		if ((year%4==0)&&(year%100!=0)||(year%400==0)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String nameSeason(){
		
	
	switch (this.month){
	case 12: case 1: case 2: case 3:
		System.out.println(" Estacion: Invierno ");
	break;
	case 4: case 5: case 6: 
		System.out.println(" Estacion: Primavera ");
	break;
	
	case 7: case 8: case 9:
		System.out.println(" Estacion: Verano ");
	break;
	case 10: case 11:
		System.out.println(" Estacion: Otoño ");
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
			System.out.println("Dia: "+i+"month: "+getMonth()+"year: 	"+getYear() );
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
			return 28;
	break;
	
	 case 4: case 6: case 9: case 11:
 		return 30;
	break;
	}
	}
	
	public void sameDays(){
	
		switch(this.month){  //o getMonth()
	
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		
			System.out.println("Meses con el mismo numero de dias: Enero, marzo, mayo, junio, agosto, octubre, diciembre");
		
		break;
	
	
		case 4: case 6: case 9: case 11:
 			System.out.println("Meses con el mismo numero de dias: Abril, julio, septiembre, noviembre ");
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
	
	public int numberOfAttemps1(){
		int counter=0;
		Random aleatorio=new Random();
		do{
			int otherDay=aleatorio.nextInt(31)+1;
			int otherMonth=aleatorio.nextInt(12)+1;
			counter=counter +1;
		}while((otherDay!=getDay()) || (otherMonth!=getMonth()));
		return counter;
	}
	public int numberOfAttemps2(){
		int counter=1;
		Random aleatorio=new Random();
		int otherDay=aleatorio.nextInt(31)+1;
		int otherMonth=aleatorio.nextInt(12)+1;
		while((otherDay!=getDay()) || (otherMonth!=getMonth())){
			
			
			otherDay=aleatorio.nextInt(31)+1;
			otherMonth=aleatorio.nextInt(12)+1;
			counter=counter +1;
		}
		return counter;
	}
	
	public int whatDayIs(int dayWeek){ // en qué cae el primer dia del año (1-lunes)
		int days =numberOfDays();
		int whatDayIs= days % 7;
		int numberDay=(whatDayIs + dayWeek -1) %7;
		switch(numberDay){
		case 0:
			System.out.println(" Lunes ");
		break;
		case 1:
			System.out.println(" Martes ");
		break;
		case 2:
			System.out.println(" Miercoles ");
		break;
		case 3:
			System.out.println(" Jueves ");
		break;
		case 4:
			System.out.println(" Viernes ");
		break;
		case 5:
			System.out.println(" Sabado ");
		break;
		case 6:
			System.out.println(" Domingo ");
		break;
		
		
		
		
		





	}

			
			
			
	
		
	}
	}


	
	
