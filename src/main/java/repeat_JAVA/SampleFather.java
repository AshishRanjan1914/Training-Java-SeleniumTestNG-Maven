package repeat_JAVA;

public class SampleFather {

	SampleFather(){

	}

	SampleFather(String name, int age){
		this.name = name;
		this.age = age;
	}

	String name;
	int age;

	void eat() {
		System.out.println("SampleFather eats.");
	}

	private void snoring() {
		System.out.println("SampleFather snoring.");
	}

}
