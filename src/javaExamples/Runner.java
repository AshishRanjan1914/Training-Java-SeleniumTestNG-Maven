package javaExamples;

public class Runner {
	
	int i ;
	
	private String getname(String name) {
		return name;
	}
	
	private Runner getObjectOfRunnerClass(){
		return new Runner();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		
		Runner ref = new Runner();
		
		
		System.out.println(ref);
		
		System.out.println(ref.i);
		//String store = Runner.getname("myNewName");
		//System.out.println(store);
		 
		//System.out.println(Runner.i);
		
		Runner r = new Runner();	
		

	}

}
