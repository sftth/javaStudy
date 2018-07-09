package javaStudy.test2017.e03.q2;

public class EmployeeRun {
	public static void main(String[] args) {
		String[][] department = {{"10","영업팀"},{"20","구매팀"},{"30","개발팀"},{"40","운영팀"}};
		String[][] employee = {{"59545","최선영","10"},{"23561","박선주","20"},{"37123","김길동","10"},{"33777","이기주","30"}};
		
		String[][] result = Employee.print(department, employee);
		System.out.println("사원정보 출력");
		System.out.println("[부서명,사원번호,사원명]");
		for(String[] emp : result) {
				System.out.println("[" + emp[3] + "," + emp[1] + "," + emp[2] + "]");
		}
	}
}
