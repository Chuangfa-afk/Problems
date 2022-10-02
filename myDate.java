import java.util.GregorianCalendar;
public class myDate {
	private int year;
	private int month;
	private int day;
	
	myDate(){
		GregorianCalendar calendar = new GregorianCalendar(); 
			year = calendar.get(GregorianCalendar.YEAR);
			month = calendar.get(GregorianCalendar.MONTH);
			day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		}
	
	myDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
		
}

