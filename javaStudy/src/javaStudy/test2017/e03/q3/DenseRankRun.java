package javaStudy.test2017.e03.q3;

public class DenseRankRun {
	public static void main(String[] args) {
		int[][] input = {{10210,80},{10211,77},{10212,55},{10213,66},{10214,77},{10215,99},{10216,30},{10217,10}};
		int[][] result = DenseRank.rank(input);
		System.out.println("사번 점수 랭킹");
		for(int i=0 ; i < result.length ; i++) {
			System.out.println(result[i][0] +" "+result[i][1] +" "+result[i][2]);
		}
	}
}
