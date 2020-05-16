package javaExamples;

import java.io.ObjectInputStream.GetField;

public class SweetPlate {
	
	private String sweetName;
	private String color;
	
	public String getMeSweetName() {
		return sweetName;
	}
	
	public void setMeSweetName(String sweetname) {
		sweetName = sweetname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SweetPlate variableName = new SweetPlate();
		variableName.setMeSweetName("ladoo");
		System.out.println(variableName.getMeSweetName());
		
		SweetPlate variableName2 = new SweetPlate();
		variableName2.setMeSweetName("jalebi");
		System.out.println(variableName2.getMeSweetName());
		
		 
		
		
		
	}

}
