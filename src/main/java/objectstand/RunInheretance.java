package objectstand;

import java.io.PrintStream;

public class RunInheretance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandFather g1 = new GrandFather();


		Father f1 = new Father();
		f1.age= 10;
		f1.name = "Java";
		f1.profession = "xyz";
		f1.Address = "chandni chowk";


		System.out.println(f1.age);
		System.out.println(f1.name);
		System.out.println(f1.profession);
		System.out.println(f1.Address);
		//f1.eat();
		//f1.excercise();
		//f1.walk();

		Child c1 = new Child(); c1.crying();
		c1.walk();
		c1.crying();
		c1.play();




		Father f2 = new Father("Selenium",10,"pqr","Rajeev Chowk");


		System.out.println(f2.age);
		System.out.println(f2.name);
		System.out.println(f2.profession);
		System.out.println(f2.Address);

		Father c2 = new Child(20);
		c2.job();
		c2.excercise();

		Father f3 = new Father();

		f3.watchingTv();
		f3.bookReading();

		//Object casting to its parent tyep
		GrandFather f4 = new Father();

		//Error : watchingTv is undefined for GrandFather Type 
		//f4.watchingTv();
		f4.bookReading();
	}

}
