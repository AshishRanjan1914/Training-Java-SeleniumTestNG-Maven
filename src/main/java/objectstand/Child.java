package objectstand;

public class Child extends Father {
	
	String name;
	int age;	
	String Address;
	String schoolName;
	
	public Child() {
		System.out.println("Created a Child object");
	}

	public Child(int age) {
		this.age=age;
		System.out.println("Created a Child object");
	}
	
	public void play() {
		System.out.println("Child is play");
	}
	
	public void crying() {
		System.out.println("Child is crying");
	}
	
	public void walk() {
		System.out.println("Child is walk");
	}
	
	public void excercise() {
		System.out.println("Child is excercise");
	}
	
	

}
