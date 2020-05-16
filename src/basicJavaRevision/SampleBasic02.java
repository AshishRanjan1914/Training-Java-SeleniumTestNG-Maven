package basicJavaRevision;

public class SampleBasic02 {
	
	//scope - body --
	
	//methods - public / protected / private
	
	public static int add(int x, int y) {
		int result = x+y;
				
		return result;
	}
	
	public void addition(int x, int y) {
		int result = x+y;
	}	
	
	
	static int  i;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hi");
		
		//re-usable methods
		
		int x = 10;
		int y = 20;
		
		int result = x+y;
		System.out.println(result);
		
		x = 60;
		y = 50;
		result = x+y;
		System.out.println(result);
		
		
		SampleBasic02.add(20, 30);
		
		//new object
		
		SampleBasic02 sam2 = new SampleBasic02();
		
		sam2.addition(30, 60);
		
		// conditional - decision making
		if(true) {
			System.out.println("True");
		} else {
			System.out.println("FALSE");
		}
		
		
		String todayDay = "Monday";
		
		if(todayDay.equals("Sunday")) {
			System.out.println("chiz burger");
		} else if(todayDay.equals("Monday")) {
			System.out.println("Pizza");
		} else if(todayDay.equals("Tuesday")) {
			System.out.println("Pizza");
		} else if (todayDay.equals("Friday")) {
			System.out.println("XYZ");
		} else {
			System.out.println("RICE");
		}
			 
			
		//- loop
		
		/*
		 * for (int i = 0; i <= 10; i++) { System.out.println(i);
		 * 
		 * }
		 */
		
		//for-each
		
		
		int i=1;
		
		while(i<=10) {
			//do - something
			System.out.println("In while loop");
			System.out.println(i);
			i = i+1;
		}
		
		
		
		
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);		
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		
		//repetation - 
		
		/*
		 * for (int i = 10; i >= 10; i--) { System.out.println(8*i); }
		 */
		
		int myinteger = 2;
		System.out.println(myinteger); // 2
		System.out.println(myinteger=myinteger+1); //3
		System.out.println(myinteger); //2
		
	}

}
