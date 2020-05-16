package objectstand;

public class ExceptionHandlngClass {
	
	private static double m1(int i) throws ArithmeticException {
		return 10/i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a  = new int[4];
		
		try {
			a[0] = 1;
			 
			int j = 100;
			int i = 0;
			System.out.println(a[4]);
			
			double result  = j/i;
			System.out.println(ExceptionHandlngClass.m1(10));
			
			System.out.println(ExceptionHandlngClass.m1(0));
			
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException"+ex.getMessage()+" >> "+ex.getCause());
		} catch(ArithmeticException ex) {
			System.out.println("ArithmeticException"+ex.getMessage()+" >> "+ex.getCause());
			
		} catch(Exception e) {
			
		} catch(Throwable t) {
			
		} finally {
			//willrun irrespective of any exception
			System.out.println("Finally");
		}
		
	}

}
