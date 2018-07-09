package javaStudy.test2017.e03.q2;

public class Employee {
	public static String[][] print(String[][] department, String[][] employee) {
		String[][] result = {{"a","a","a","a"},{"b","b","b","b"},{"c","c","c","c"},{"d","d","d","d"}};
		for(int i=0 ; i<result.length ; i++) {
			result[i][0] = employee[i][2];
			result[i][1] = employee[i][0];
			result[i][2] = employee[i][1];
			result[i][3] = getDeptName(employee[i][2], department);
		}
		sorting(result);
		return result;
	}
	
	private static String getDeptName(String deptCode, String[][] department) {
		String deptName ="";
		
		for(String[] element : department) {
			if(deptCode.equals(element[0])) {
				deptName = element[1];
			}
		}
		return deptName;
	}
	
	private static void sorting(String[][] result) {
		String temp =""; 
		for(int i=0; i< result.length-1 ; i++) {
			for(int j=i+1 ; j<result.length ; j++) {
				if(result[i][0].compareTo(result[j][0]) > 0) {
					
					for(int k = 0 ; k < 4 ; k++) {
						temp = result[i][k];
						result[i][k] = result[j][k];
						result[j][k] = temp;
					}
				} else if(result[i][0].compareTo(result[j][0]) == 0) {
					if(result[i][1].compareTo(result[j][1]) > 0) {
						
						for(int k = 0 ; k < 4 ; k++) {
							temp = result[i][k];
							result[i][k] = result[j][k];
							result[j][k] = temp;
						}
					} 
				}
			}
		}
	}
}
