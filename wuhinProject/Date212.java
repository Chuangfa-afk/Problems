package wuhinProject;


public class Date212 implements Comparable{
	private int year;
	private int month;
	private int day;
	
	public Date212(String date) {
		try {
			this.year = Integer.parseInt(date.substring(0, 4));
			this.month = Integer.parseInt(date.substring(4, 6));
			this.day = Integer.parseInt(date.substring(6, 8));
		}catch (Exception E) {
			System.out.println("Invalid format");
		}
	}
	
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public void setYear(String year) {
		this.year = Integer.parseInt(year);
	}
	public void setMonth(String month) {
		this.month = Integer.parseInt(month);
	}
	public void setDay(String day) {
		this.day = Integer.parseInt(day);
	}
	public int compareTo(Object o) {
		if(o instanceof Date212) {
			Date212 date = (Date212) o;
			if(this.year > date.getYear()) {
				return 1;
			}else if(this.year < date.getYear()) {
				return -1;
			}else {
				if(this.month > date.getMonth()) {
					return 1;
				}else if(this.month < date.getMonth()) {
					return -1;
				}else {
					if(this.day > date.getDay()) {
						return 1;
					}
					else if(this.day < date.getDay()) {
						return -1;
					}
					else {
						return 0;
					}
				}
			}
		}else {
			throw new IllegalArgumentException("Enter a correct date");
		}
	}
	public boolean equals(Object o) {
		if(o instanceof Date212)
			return this.compareTo((Date212) o)==0?true:false;
		return false;
	}
	public String toString() {
		String output = "";
		switch(this.month) {
		case 1: output += "January "; break;
		case 2: output += "Febraury "; break;
		case 3: output += "March "; break;
		case 4: output += "April "; break;
		case 5: output += "May "; break;
		case 6: output += "June "; break;
		case 7: output += "July "; break;
		case 8: output += "August "; break;
		case 9: output += "September "; break;
		case 10: output += "October "; break;
		case 11: output += "November "; break;
		case 12: output += "December "; break;
		}
		output += String.valueOf(this.day) + ", ";
		output += String.valueOf(this.year);
		return output;
	}
	public String stringFormat() {
		String year = String.valueOf(this.year);
		String month = this.month<10?"0"+String.valueOf(this.month):String.valueOf(this.month);
		String day = this.day<10?"0"+String.valueOf(this.day):String.valueOf(this.day);
		return year+month+day;
	}
	
	public static void main(String[] args) {
		Date212 x = new Date212("20110212");
		Date212 y = new Date212("20211224");
		System.out.println(x.stringFormat());
	}
	

	
	
}