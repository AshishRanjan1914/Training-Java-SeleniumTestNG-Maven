package repeat_JAVA;

public class SampleChild extends SampleFather{
	
	String school;
	
	SampleChild(String school){
		this.school = school;
	}
	
	SampleChild(){
		
	}
	
	//overload
	void eat(String wayOfEatcing) {
		System.out.println("Hero Child eats."+wayOfEatcing);
	}
	//override
	void eat() {
		System.out.println("Hero Child eats.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String childDetails = school;
		
		return childDetails;
	}
	
	private void dance() {
		System.out.println("Hero Child dance.");
	}
}
