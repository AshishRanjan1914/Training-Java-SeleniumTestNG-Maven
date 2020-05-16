package objectstand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapColectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashMap<Father, Child> fatherChildMap = new HashMap<Father, Child>();
		
		HashMap myMap = new HashMap<String, String>();
		myMap.put("A", "Apple");
		myMap.put("B", "Ball");
		myMap.put("C", "Cat");
		myMap.put("D", "Doll");
		System.out.println(myMap);

		System.out.println(myMap.get("C"));
		
		System.out.println(myMap.keySet());
		
		System.out.println(myMap.size());
		
		System.out.println(myMap.isEmpty());
		
		myMap.clear();
		System.out.println(myMap);
		
		System.out.println(myMap.isEmpty());
		
		



	}

}
