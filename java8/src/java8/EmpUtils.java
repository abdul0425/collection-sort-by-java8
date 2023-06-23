package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpUtils {

//	Creating List of employees
	public static List<Employee> getEmpList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Rivu", 26000.00));
		empList.add(new Employee(201, "Sasthi", 20000.00));
		empList.add(new Employee(301, "Abdul", 30000.00));
		empList.add(new Employee(401, "Keerthana", 22000.00));
		empList.add(new Employee(501, "Bubai", 40000.00));
		empList.add(new Employee(601, "Anjani", 60000.00));
		empList.add(new Employee(701, "Akhil", 65000.00));

		return empList;
	}

//	Sorting based on empName using java 8 features
	static void sortByNameAnonymous(List<Employee> list) {

		// By Using Anonymous class
		Comparator<Employee> comp = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getEmpName().compareTo(o2.getEmpName());
			}
		};

		Collections.sort(list, comp);
		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

//	Using Lambda expression
	static void sortByNameLambdaExp(List<Employee> list) {
		Comparator<Employee> lambdaExpression = (emp1, emp2) -> emp1.getEmpName().compareTo(emp2.getEmpName());

		Collections.sort(list, lambdaExpression);

		for (Employee employee : list) {
			System.out.println(employee);
		}

	}

//	Using Java 8 Stream
	static void sortByNameStream(List<Employee> list) {
		list.stream().sorted((emp1, emp2) -> emp2.getEmpName().compareTo(emp1.getEmpName()))
				.forEach(System.out::println);
	}
}
