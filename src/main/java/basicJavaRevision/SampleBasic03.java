package basicJavaRevision;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SampleBasic03 { // JVM - java virtual machine

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub


		// exception handling...


		// catched / non-cached -- complile time and run-time exception

		System.out.println();
		System.out.println();

		int i = 10;
		int j = 0;

		//try - catch block


		try {
			System.out.println("Inside try block");
			int result = i/j;	
			System.out.println(result);
			System.out.println();
		} catch (Exception randomVariable) {
			System.out.println("Inside ArithmeticException catch block");
			System.out.println("I have handled ArithmeticException");
			System.out.println(randomVariable.getCause());
			System.out.println(randomVariable.getMessage());
			randomVariable.printStackTrace();

		} finally {
			System.out.println("I m first finally");			
		}


		//Run - time exception ArithmeticException



		//compile time exception

		try {
			File f = new File("");
			// FileNotFoundException
			FileInputStream fis = new FileInputStream(f); // -- type

			fis.close();

		} catch (FileNotFoundException fileNotFounfExc) {
			System.out.println("FileNotFoundException");
			System.out.println(fileNotFounfExc.getCause());
			System.out.println(fileNotFounfExc.getMessage());
			fileNotFounfExc.getStackTrace();

		} catch (Throwable  ee) {
			System.out.println("IOException");
		} finally {
			System.out.println("I m second finally");
		}

		// Handling exception ... throw... 

	}

}
