public class Mood {
	public static void main(String args[]) {
		sadObject so = new sadObject();
		happyObject ho = new happyObject();
		
		PsychiatristObject psy = new PsychiatristObject();
		
		psy.examine(ho);
		psy.observe(ho);
		
		psy.examine(so);
		psy.observe(so);	
		
	}

}

abstract class MoodyObject {
	
	protected abstract String getMood();
	
	protected abstract void expressFeelings();
	
	public void queryMood() {
		System.out.println("I feel "+this.getMood()+ " today!\n");
	}
}

class sadObject extends MoodyObject{

	@Override
	protected String getMood() {
		return("Sad");
	}

	@Override
	protected void expressFeelings() {
		String feel = "'wah' 'boo hoo' 'weep' 'sob' 'weep'";
		System.out.println(feel);
	}
	
	public String toString() {
		return "Subject cries a lot";
	}
	
}

class happyObject extends MoodyObject{

	@Override
	protected String getMood() {
		
		return("Happy");
		
	}
	
	@Override
	protected void expressFeelings() {
		String feel = "hehehe...hahahah...HAHAHAHAHA!!!";
		System.out.println(feel);
	}
	
	public String toString() {
		return "Subject laughs a lot";
	}
	
}

class PsychiatristObject{
	public void examine(MoodyObject moodyObject) {
		System.out.print("How are you feeling today?\n");
		moodyObject.queryMood();
		moodyObject.expressFeelings();
	}
	
	public void observe(MoodyObject moodyObject) {
		System.out.println("Observation: " + moodyObject);
		System.out.println("\n");
	}
	
}


