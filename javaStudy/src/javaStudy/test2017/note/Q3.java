package javaStudy.test2017.note;

public class Q3 {
	public static void main(String[] arags) {
		int total = -1;
		
		try {
			total = sum();
			System.out.println("total=" + total);
		} catch (RuntimeException e) {
			System.out.println("exception at main()");
		}
	}
	
	private static int sum() {
		int sum = 0;
		int array[] = {10,20,40};
		
		try {
			for(int i=0; i<=array.length; i++) {
				sum += array[i];
			}
		} catch( ArrayIndexOutOfBoundsException e) {
			System.out.println("exception at sum()");
			throw new RuntimeException();
		} finally {
			System.out.println("return from sum()");
			return sum;
		}
	}
}
