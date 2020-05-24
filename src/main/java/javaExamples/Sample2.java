package javaExamples;

class Sample2{
	int i ;
	byte b;
	double d;
	float f;
	boolean bo;
	short s;
	long l;
	char c;
	
	private Sample2() {
		System.out.println("I am going to run");		
	}
	
	private Sample2(int i) {
		this.i = i; 		
		
		System.out.println("I am going to run");		
	}
	
	private Sample2(int i,int j,double d,float f,boolean bo) {
		this.i = i;
		
		this.d = d;
		this.f = f;
		this.bo = bo;
		this.s = s;
		this.l = l;
		
		
		System.out.println("I am going to run");		
	}
	

	
	private void printEveryGlobalVaribale() {
		System.out.println(i);
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);
		System.out.println(s);
		System.out.println(l);
		System.out.println(bo);
		System.out.println(c);
		
	}
	
	private int getIntegerValue() {
		int i = 10;
		return this.i;
	}
	
	private void setIntegerValue(int i) {
		 this.i = i;
	}
	
	public static int add(int a, int b) {
		
		int res = a+b;
		//System.out.println(res);
		return res;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
		int output = Sample2.add(10,20);
		//System.out.println(output);
		
		Sample2 ref = new Sample2(20);
		Sample2 newRef = new Sample2(1, 1, 1, 1,true);
		

		ref.printEveryGlobalVaribale();
		
		newRef.printEveryGlobalVaribale();
		
	}
	
}
