package objectstand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ListColectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List
		//Set
		//Map
		
		//Object creation nof array list
		List newList = new ArrayList();
		
		for (int i = 1; i <= 14; i++) {
			int result  = 2;
			//System.out.println(result);
			
			newList.add(result);			
		}
		
		System.out.println("Size is >>"+newList.size());
		
		for (int i = 0; i <newList.size() ; i++) {
			System.out.println(newList.get(i));
		}
		
		
		
		
		

	}

}
