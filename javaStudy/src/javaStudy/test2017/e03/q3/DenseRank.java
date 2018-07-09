package javaStudy.test2017.e03.q3;

public class DenseRank {
	public static int[][] rank(int[][] input) {
		int[][] result = {{1,1,1},{1,1,1},{1,1,1},{1,1,1},{1,1,1},{1,1,1},{1,1,1},{1,1,1}};
		int temp = 0;
		int rank = 1;
		
		for(int i = 0; i< input.length ; i++) {
			for(int j = 0 ; j<2 ; j++) {
				result[i][j] = input[i][j];				
			}
		}
		
		for(int i=0 ; i < result.length-1 ; i++) {
			for(int j=i+1 ; j< result.length ; j++) {
				if(result[i][1] < result[j][1]) {
					for(int k=0 ; k < 2 ; k++) {
						temp = result[i][k];
						result[i][k] = result[j][k];
						result[j][k] = temp;
					}
				}
			}
		}
		
		result[0][2] = rank;
		
		for(int i=1 ; i < result.length ; i++)
			if(result[i-1][1] == result[i][1]) {
				result[i][2] = rank;
			}else {
				rank++;
				result[i][2] = rank;
			}
		return result;
	}
}
