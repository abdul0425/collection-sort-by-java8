package java8;

import java.util.List;

public class EmpDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = EmpUtils.getEmpList();
		
		//EmpUtils.sortByNameAnonymous(empList);
		
		//EmpUtils.sortByNameLambdaExp(empList);
		
		// Descending order
		EmpUtils.sortByNameStream(empList);
		
	}

}
