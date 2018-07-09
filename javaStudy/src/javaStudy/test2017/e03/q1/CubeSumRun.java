package javaStudy.test2017.e03.q1;

public class CubeSumRun {
	public static void main(String[] args) {
		int[][] cube = {{5,7,8},{4,2,1},{2,5,6}};
		int[][] sum = CubeSum.sum(cube);
		System.out.println("큐브의 합:");
		for(int i=0; i<3 ; i++) {
			System.out.println(sum[i][0]+" "+sum[i][1]+" "+sum[i][2]);
		}
	}
}
