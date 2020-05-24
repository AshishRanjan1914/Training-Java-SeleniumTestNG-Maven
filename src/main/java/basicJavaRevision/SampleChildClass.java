package basicJavaRevision;

public class SampleChildClass extends SampleParentClass{
	
	String name;
	int age;
	
	public void dancing() {
		System.out.println("SampleChildClass is dancing.");
	}
	
	@Override
	public void walking() {
		System.out.println("SampleChildClass is walking.");
	}
	
	@Override
	public void talking() {
		System.out.println("SampleChildClass is talking.");
	}
	
	public SampleChildClass() {
		System.out.println("Basic Constructor .");
		
	}
	
	public SampleChildClass(String name, int age) {
		System.out.println("Constructor .");
		super.name = name;
		super.age = age;
		
		this.age = age - 2;
		this.name  = name+"Another";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SampleChildClass child1 = new SampleChildClass("name", 30);
		child1.dancing();
		
		
		child1.walking();
		
		child1.talking();
		
		System.out.println(child1.age);
		
		System.out.println(child1.name);
		
		SampleParentClass parent3  = new SampleParentClass("anothername", 55);
		System.out.println(parent3.age);
		System.out.println(parent3.name);
		
		// cast .. parent..
		SampleParentClass child3 = new SampleChildClass();
		
		child3.walking();
		child3.talking();
		
		//child hide his own feature.. compile error..
		 //child3.dancing();

	}

}
