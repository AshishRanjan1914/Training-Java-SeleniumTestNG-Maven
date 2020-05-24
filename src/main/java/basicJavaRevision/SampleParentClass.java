package basicJavaRevision;

public class SampleParentClass {
	
	public SampleParentClass(){
		System.out.println("basic constructor of SampleParentClass");
	}
	
	public SampleParentClass(String name, int age){
		System.out.println(" constructor of SampleParentClass, name & age");
		this.age = age;
		this.name = name;
	}
	
	public int age;
	public String name;
	
	public void walking() {
		System.out.println("SampleParentClass is walking.");
	}
	
	public void talking() {
		System.out.println("SampleParentClass is talking.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleParentClass parent1 = new SampleParentClass();
		parent1.walking();
		parent1.talking();		
		System.out.println(parent1.age);
		System.out.println(parent1.name);		
		
		SampleParentClass parent2 = new SampleParentClass("Java", 30);
		parent2.walking();
		parent2.talking();		
		System.out.println(parent2.age);
		System.out.println(parent2.name);

	}

}
