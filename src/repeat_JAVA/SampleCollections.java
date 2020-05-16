package repeat_JAVA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List
		//Interface- 

		List<String> myList1 = new ArrayList<String>();

		myList1.add("a");
		myList1.add("b");
		myList1.add("c");
		myList1.add("d");
		myList1.add("e");
		myList1.add("g");
		myList1.add("f");
		myList1.add("g");

		System.out.println(myList1);

		for (int i = 0; i < myList1.size(); i++) {
			System.out.println("Value at :"+i +" = "+myList1.get(i));

		}
		
		

		List<String> myList2 = new ArrayList<String>();

		myList2.add("aa");
		myList2.add("bb");
		myList2.add("gg");
		myList2.add("ff");
		myList2.add("gg");
		
		
		
		//add myList2 data into mylist1 
		
		/*
		 * for (int i = 0; i <= myList2.size(); i++) { myList1.add(myList2.get(i));
		 * 
		 * }
		 */
		
		myList1.addAll(myList2);
		
		System.out.println(myList1);
		
		myList1.removeAll(myList2);
		
		System.out.println(myList1);
		
		for (String eachValue : myList2) {
			System.out.println(eachValue);
			
		}
		
		
		Iterator<String> myIterator = myList1.iterator();
		
		while (myIterator.hasNext()) {
			
			System.out.println(myIterator.next());
			
		}
		int i=1;
		while(i<=10) {
			int result=i*2;
			System.out.println(result);
			i++;
		}
		
		
		
		
	}

}
