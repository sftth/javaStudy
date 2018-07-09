package javaStudy.test2017.e03.q1;

public class CubeSum {
	public static int[][] sum(int[][] cube) {
		int[][] sum = {{0,0,0},{0,0,0},{0,0,0,},{0,0,0}};
		int rotate = 2;
		for(int i=0; i< 3; i++) {
			rotate = 2;
			for(int j=0; j < 3 ; j++) {
				sum[i][j] = cube[i][j] + cube[rotate][i];
				rotate--;
			}
		}
		return sum;
	}
}
