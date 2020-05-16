package basicJavaRevision;

public class SampleBasic01 {
	
	//constructors - no return - creating objects.
	private SampleBasic01(){
		System.out.println("START I am Constructor SampleBasic01 - 0");	
		System.out.println("END I am Constructor SampleBasic01 - 0");
	}
	
	private SampleBasic01(int i){
		System.out.println("START I am Constructor SampleBasic01 - 1");	
		System.out.println("END I am Constructor SampleBasic01 - 1");
	}
	
	
	private SampleBasic01(int i, int j){
		System.out.println("START I am Constructor SampleBasic01 - 2");	
		System.out.println("END I am Constructor SampleBasic01 - 2");
	}
	
	//Global varibale - non static 
	int i =1; // 0 - Default
	boolean isTrue = true; // false
	float f = 1 ; // 0.0
	double d = 0.1; // 0.0
	
	//Global varibale - static 
		static int j; // 0
		static boolean isFalse; // false
		static float g;
		static double e;
	
	//non-static method
	private void methodName1() {
		System.out.println("non - methodName");
	}
	
	//method overloading
	private void methodName1(int i) {
		System.out.println("non - methodName"+i);
	}
	
	private void methodName1(int i, int j) {
		System.out.println("non - methodName"+i+" & "+j);
	}
	
	//non-static method
		private static void methodName2() {
			System.out.println("static methodName");
		}
	
	
	public static void main(String[] args) {
		System.out.println("Hi");
		
		//creating objects of an class		 - default constructor
		//constuctor - object creates
		//whenever an object of class is created then the body of constructor gets executed.
		SampleBasic01 myObject1 = new SampleBasic01();
		
		//Calling Non static memebers - call via object reference
		System.out.println(myObject1.i);
		System.out.println(myObject1.isTrue);
		System.out.println(myObject1.f);
		System.out.println(myObject1.d);
		
		//non static method call
		myObject1.methodName1();
		myObject1.methodName1(2);
		myObject1.methodName1(2,4);
		
				
		
		//Assignment operators in java
		j = 20;
		isFalse = false;
		//Calling static members
		System.out.println(SampleBasic01.j);
		System.out.println(SampleBasic01.isFalse);
		
		//calling static method
		SampleBasic01.methodName2();
		
		SampleBasic01 myObject2 = new SampleBasic01(2);
		myObject2.methodName1();
		
		
		SampleBasic01 myObject3 = new SampleBasic01(2, 4);
		myObject3.methodName1(2, 4);
	}

}
