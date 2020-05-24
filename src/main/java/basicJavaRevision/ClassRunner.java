package basicJavaRevision;

public class ClassRunner {
	
	static boolean istrue;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass p2 = new ParentClass();
		p2.walking();
		
		ChildClass c2 = new ChildClass();
		c2.dancing();
		
		
		if(istrue) {
			System.out.println("");
		} else {
			System.out.println("else");
		}
		
		System.out.println("LOOP STARTED");
		//for loop
		for (int i = 1; i <= 10; i++) {
			int result = 2*i;
			
			if(result == 10) {
				System.out.println("Java !!");
				//break;
				continue;
			}
			
			System.out.println(result);
			
		}
		System.out.println("LOOP ENDED");
	}

}
