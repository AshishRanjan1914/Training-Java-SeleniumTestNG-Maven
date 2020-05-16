package basicJavaRevision;

public class ParentClass {
	
	public ParentClass() {
		// TODO Auto-generated constructor stub
		System.out.println("ParentClass constructor");
	}
	
	//private / protected / public
	
	public void walking() {
		System.out.println("ParentClass is walking.");
	}
	
	public void running() {
		System.out.println("ParentClass is running.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass p1 = new ParentClass();
		p1.walking();
		p1.running();

	}

}
