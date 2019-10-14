package Question4;

public class Pet {
	
	private String name;
	private String ownerName;
	private String color;
	protected int sex;
	public static final int MALE=0, FEMALE=1, SPAYED=2, NEUTERED=3;
	
	
	Pet(String name, String ownerName, String color) {
		this.name = name;
		this.ownerName = ownerName;
		this.color = color;
	}
		
	public String getPetName(){
		return this.name;
	}
		
	public String getOwnerName() {
		return this.ownerName;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setSex(int sex) {
		this.sex = sex;
		System.out.println(this.sex);
	}
	
		
	public String getSex() {
		if(this.sex == Pet.MALE) {
			System.out.println("get " + this.sex);
			return "MALE";
		}
		else if(this.sex == Pet.FEMALE)
			return "FEMALE";
		else if( this.sex == Pet.SPAYED)
			return "SPAYED";
		else if( this.sex == Pet.NEUTERED)
			return "NEUTERED";
		else
			return "Sex not set";
	}
	
	public String toString() {
		String returnString = this.getPetName() + " owned by " + this.getOwnerName() + "\n" + "Color: " + this.getColor() + "\n" + "Sex:" + 
	this.getSex(); 
		return returnString;
		}
	
	public static void main(String args[]){
		String Name = "Snowy";
		String ownerName = "Lakshmi";
		String color = "Brown";
		Pet dog = new Pet(Name,ownerName, color);
		dog.setSex(2);;
		System.out.println(dog);
	}

}
