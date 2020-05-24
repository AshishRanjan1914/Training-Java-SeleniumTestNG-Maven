package javaExamples;

public class SampleStringPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am Java|I am |awesome";
		String s1 = "sds";
		String s2 = "SDS";
		boolean isEmpty  = s1.isEmpty();
		System.out.println(isEmpty);
		
		//split
		String[] splittedStringArray = s.split("|");
		
		int lengthOfSplitedArray = splittedStringArray.length;
		System.out.println("Lenght = :"+lengthOfSplitedArray);
		
		for (int i = 0; i < lengthOfSplitedArray; i++) {
			//System.out.println(splittedStringArray[i]);
			
		}
		
		System.out.println(s.substring(0, 4));
		
		int i = 10;

		String myParagraph = s +" < > "+ s1 +"And Value is : "+i;
		
		System.out.println(myParagraph);
		
		System.out.println(String.valueOf(10));
		
		System.out.println(s.concat(s1).concat("volla!"));
		
		System.out.println("startsWith >>"+s.startsWith("I am"));
		
		System.out.println("equals >>"+s1.equals("sds"));
		
		System.out.println("equals >>"+s1.equals(s2));
		
		System.out.println("equalsIgnoreCase >>"+s1.equalsIgnoreCase(s2));
		
		System.out.println("contains >>"+s.contains("Java"));
		
		System.out.println("charAt >>"+s.charAt(2));
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s.indexOf("|"));
		
		System.out.println(s.length());

	}

}
