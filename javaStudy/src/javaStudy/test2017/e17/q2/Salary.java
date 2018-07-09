package javaStudy.test2017.e17.q2;

public class Salary {
	public static String[][] print(String[][] salary, String[][] employee) {
		String[][] resultArr = {{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""}};
		String[][] avgArr = {{"",""},{"",""},{"",""},{"",""},{"",""}};
		String[] grade = {"사원","대리","과장","차장","부장"};
		for(int i=0 ; i< salary.length ; i++) {
			for(int j=0 ; j<employee.length ; j++) {
				if(salary[i][0].equals(employee[j][0])) {
					resultArr[i][0] = employee[j][2];
					resultArr[i][1] = salary[i][1];
				}
			}
		}
		
		for(int i=0 ; i<grade.length; i++) {
			int sumSalary = 0;
			int countEmployee = 0;
			for(String[] result : resultArr) {
				if(grade[i].equals(result[0])) {
					sumSalary += Integer.parseInt(result[1]);
					countEmployee++;
				}
			}
			avgArr[i][0] = grade[i];
			int val = Math.round(sumSalary/countEmployee);
			avgArr[i][1] = String.valueOf(val);
		}
		
		return avgArr;
	}
}
