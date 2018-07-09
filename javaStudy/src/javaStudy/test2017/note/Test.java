package javaStudy.test2017.note;

public class Test {
	public static void main(String[] args) {
		int[] x = {1,2,3};
		int y[] = {4,5,6};
		
		new Test().method(x,y);
	}
	
	void method(int[]...b) {
		for(int[] a : b) {
			System.out.println(a[0]);
		}
	}
}
