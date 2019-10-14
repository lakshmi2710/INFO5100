package Question4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog extends Pet {
	private String Size;
	private String BoardStart;
	private String BoardEnd;

	Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.Size = size;
		
	}
	
	public String getSize() {
		return this.Size;
	}
	
	public void setBoardStart(int month, int day, int year) {
		if( month >12 || month < 0 || day > 31 || day < 0 || year < 1000 || year > 9999) {
			System.out.println("invalid date format");
		}
		else {
			this.BoardStart = month + ":" + day + ":" + year;
		}
	}
	
	public void setBoardEnd(int month, int day, int year) {
		if( month >12 || month < 0 || day > 31 || day < 0 || year < 1000 || year > 9999) {
			System.out.println("invalid date format");
		}
		else {
			this.BoardEnd = month + ":" + day + ":" + year;
		}
	}
	
	public boolean boarding(int month, int day, int year) {
		String DateGiven = month + ":" + day + ":" + year;
		
		SimpleDateFormat format = new SimpleDateFormat("MM:dd:yyyy");
	
			try {
				Date Start = format.parse(this.BoardStart);
				Date End = format.parse(this.BoardEnd);
				Date date = format.parse(DateGiven);
				
				if ((date.compareTo(Start) >= 0) && (End.compareTo(date) >= 0)) {
					
					return true;
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
			return false;	
	}
	
	
	public String toString() {
		String retString = "DOG:\n"+ super.toString() + "\nSize: " + this.Size;
		return retString;
	}
	
	
	
	public static void main(String args[]){
		String Name = "dogy";
		String ownerName = "Lakshmi";
		String color = "Brown";
		String size = "medium";
		Dog bow = new Dog(Name,ownerName, color, size);

		bow.setSex(0);
		
		System.out.println(bow);
		bow.setBoardEnd(10, 1, 2019);
		bow.setBoardStart(02, 21, 2019);
		System.out.println(bow.boarding(10, 2, 2019));
	}

}
