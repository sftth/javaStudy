package javaStudy.test2017.e17.q2;

public class SalaryRun {
	public static void main(String[] args) {
		String[][] salary= {{"23561","5600"},{"37123","4100"},{"33777","4400"},{"13451","6300"},{"23579","5900"},{"87594","2400"},{"59545","3500"},{"49376","3600"}};
		String[][] employee= {
				{"59545","나연","대리"},
				{"37123","정연","대리"},
				{"23561","모모","과장"},
				{"33777","사나","과장"},
				{"23579","지효","차장"},
				{"87594","미나","사원"},
				{"13451","다현","부장"},
				{"49376","채영","대리"}
				};
		String[][] avgArr = Salary.print(salary, employee);
		for(int i = 0 ; i< avgArr.length ; i++) {
			System.out.println(avgArr[i][0]+"/"+avgArr[i][1]);
		}
	}
}
