package Question4;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat extends Pet {
	private String hairLength;
	private String BoardStart;
	private String BoardEnd;

	Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
		
	}
	
	public String getHairLength() {
		return this.hairLength;
	}
	
	public void setBoardStart(int month, int day, int year) {
		if( month >12 || month < 0 || day > 31 || day < 0 || year < 1000 || year > 9999) {
			System.out.println("invalid date format");
		}
		else {
			this.BoardStart = month + ":" + day + ":" + year;
			System.out.println(this.BoardStart);
		}
	}
	
	public void setBoardEnd(int month, int day, int year) {
		if( month >12 || month < 0 || day > 31 || day < 0 || year < 1000 || year > 9999) {
			System.out.println("invalid date format");
		}
		else {
			this.BoardEnd = month + ":" + day + ":" + year;
			System.out.println(this.BoardEnd);
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
		String retString = "CAT:\n"+ super.toString() + "\nHair: " + this.hairLength;
		return retString;
	}
	
	
	
	public static void main(String args[]){
		String Name = "Bushy";
		String ownerName = "LAkshmi";
		String color = "Brown";
		String hair = "Long";
		Cat meow = new Cat(Name,ownerName, color, hair);
		int sex = 2;
		meow.setSex(sex);
		System.out.println(meow);
		meow.setBoardEnd(10, 1, 2019);
		meow.setBoardStart(02, 21, 2019);
		System.out.println(meow.boarding(10, 2, 2019));
	}

}
