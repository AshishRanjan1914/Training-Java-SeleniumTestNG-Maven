package basicJavaRevision;

import java.util.ArrayList;
import java.util.HashMap;

public class Sample07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//List
		//Set
		//Map
		
		ArrayList arrayList = new ArrayList<String>();
		System.out.println(arrayList);
		
		
		arrayList.add("A");
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");
		
		System.out.println(arrayList);
		
		
		for (Object eachObject : arrayList) {
			System.out.println(eachObject);
			
		}
		System.out.println("********************");
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		
		HashMap map = new HashMap<String, Integer>();
		
		map.put("A", 5);
		map.put("B", 5);
		map.put("C", 5);
		map.put("D", 5);
		map.put("E", 6);
		map.put("F", 5);
		map.put("G", 5);
		
		System.out.println(map);	
		
		System.out.println(map.get("E"));
		

	}

}
