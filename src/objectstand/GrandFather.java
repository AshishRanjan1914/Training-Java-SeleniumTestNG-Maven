package objectstand;

public class GrandFather {
	
	public static String cast ;
	public static final String finalCast = "toTestFinalCast";
	
	public String name;
	public int age;
	public boolean isFunny;
	public String Address;
	
	public String toString() {
		
		String s = "name ="+name +"age ="+age+"isFunny ="+isFunny+"Address ="+Address;
		
		String objectDetails = String.format("my object details are Cast= %s, name= %s, age %d, isFunny %b, address %s", cast, name,age,isFunny,Address);		
		return objectDetails;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isFunny() {
		return isFunny;
	}

	public void setFunny(boolean isFunny) {
		this.isFunny = isFunny;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	public void bookReading() {
		System.out.println("GrandFather is reading book");
	}
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * GrandFather.cast = "xyz";
	 * 
	 * GrandFather g1 = new GrandFather(); g1.setName("baba"); g1.setAge(60);
	 * g1.setFunny(true); g1.setAddress("Noida"); System.out.println(g1.toString());
	 * 
	 * GrandFather g2 = new GrandFather(); System.out.println(g2.toString());
	 * 
	 * GrandFather.cast = "PQR"; System.out.println(g1.toString());
	 * System.out.println(g2.toString());
	 * 
	 * }
	 */
	
}
