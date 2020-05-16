package javaExamples;

public class StudentName
{ 
	public  static void printstudentName(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println("Pandey");

		}
	}

	public void checkOddEven(int n)
	{
		
		if(n%2 == 0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");			
		}

	}

	public static void main(String[]args) 
	{  
		//	 StudentName.printstudentName(2);
		StudentName obj=new StudentName();
		printstudentName(2);
		
		obj.checkOddEven(11);
		obj.checkOddEven(11);
	}
}





