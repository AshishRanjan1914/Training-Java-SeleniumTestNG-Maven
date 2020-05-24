package repeat_JAVA;

public class SampleDataStruc {


	//non static
	int i;
	String a;
	double b;
	float c;

	//static
	static int s;

	//accessModilfier static/non-static returnType nameOfTheMethod
	private int methodName(int a) {
		return 10+a;

	}

	private static int methodName(int a, int b) {
		return 10+a+b;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleDataStruc meraVaribale = new SampleDataStruc();

		//object - non-static
		meraVaribale.i = 20;
		System.out.println(meraVaribale.i);
		
		int resultOfNonStatic = meraVaribale.methodName(2);

		System.out.println(resultOfNonStatic);

		//static - class name
		SampleDataStruc.s = 800;
		System.out.println(SampleDataStruc.s);
		
		int resultOfStatic = SampleDataStruc.methodName(2, 8);

		System.out.println(resultOfStatic);

		
		int a[] = new int[10];
		
		for (int i = 1; i <= 10; i++) {
			a[i-1] = i*2;			
			
		}
		
		System.out.println(a[9]);
		
		
		
		
		
		
		

		






	}

}
