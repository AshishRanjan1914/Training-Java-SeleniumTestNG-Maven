package objectstand;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[10];
		
		int[] b = new int[6];

		try {
			for (int i = 0; i < 10; i++) {

				a[i] = i+1;
				//System.out.println(a[i]);

			}

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception Occured."+ ex.getMessage());
		}

	}

}
