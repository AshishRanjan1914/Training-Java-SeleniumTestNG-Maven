package repeat_JAVA;

public class SamplePrac1 {
	
 private SamplePrac1(){
	 System.out.println("my default const.");
	 
		
	}
 
 private SamplePrac1(int num1){
	 this();
	 
	 System.out.println("my default const."+num1);
	 this.num1 = num1;
	 
	}
 
 private SamplePrac1(int num1, int num2){
	 this(20);
	 System.out.println("my default const."+num1);
	 this.num1 = num1;
	}
	
	private int num1;
	
	private static int num2 = 200;
	
	private int addNumber1(int a, int b, int c) {
		
		int z;
		return a+b+c;
		
	}
	
	private static int addNumber2(int a, int b, int c) {
		return a+b;
		
	}
	
	private static void addNumber(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
	
	static {
		System.out.println("hello, I am first");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Hi");
//		System.out.print("I am  good.- \nwoooo !");
//		System.out.println("\t How about you?");
//		System.out.println("I am also good");
//		System.out.print("What else?");
//		System.out.print("Everything is fine?");
//		System.out.println("See u then");
//		System.out.println("Bye!");
		
		
		SamplePrac1 referenceVariableSamplePrac1 = new SamplePrac1(10,10);
		
		//System.out.println(referenceVariableSamplePrac1);
		
		//SamplePrac1 referenceVariableSamplePrac2 = referenceVariableSamplePrac1;

		//System.out.println(referenceVariableSamplePrac2);
		//referenceVariableSamplePrac1.num1 = 20;
		
		//SamplePrac1 referenceVariableSamplePrac3 = new SamplePrac1();
		
		//System.out.println(referenceVariableSamplePrac1.num1);
		//System.out.println(referenceVariableSamplePrac2.num1);
		//System.out.println(referenceVariableSamplePrac3.num1);
		
		//System.out.println(SamplePrac1.num2);
		
		 //int sumresult = SamplePrac1.addNumber2(5, 4, 2);
		 
		 //System.out.println(sumresult);
		 
		// SamplePrac1 referenceVariableSamplePrac4 = new SamplePrac1(500);
		 
		 //System.out.println(referenceVariableSamplePrac4.num1);
		 

	}

}
