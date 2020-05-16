package objectstand;

public class Father extends GrandFather{
	
String name;
int age;
String profession;
String Address;

public Father() {
	System.out.println("Created a father object");
}

public Father(int age) {
	this.age=age;
	System.out.println("Created a father object");
}

public Father(String name,int age,String profession, String Address) {
	this.name=name;
	this.age=age;
	this.profession=profession;
	this.Address=Address;
	
	System.out.println("Created a father object");
}


public void job(){
	System.out.println("Father Job");
}

public void smile() {
	System.out.println("Father is smiling");
}

public void walk() {
	System.out.println("Father is walk");
}

public void eat() {
	System.out.println("Father is eat");
}

public void excercise() {
	System.out.println("Father is excercise");
}

public void watchingTv() {
	System.out.println("Father is watchingTv");
}

public void bookReading() {
	System.out.println("Father is reading book");
}



}
