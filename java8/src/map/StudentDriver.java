package map;

import java.util.Map;

public class StudentDriver {

	public static void main(String[] args) {
		Map<Integer, Student> map = StudentUtils.getStudentMap();
		
		// Sort by name traditional way
		StudentUtils.sortByStudentName(map);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		// sort by address using lambda exp
		StudentUtils.sortByStudentAddress(map);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		StudentUtils.sortByStudent(map);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		StudentUtils.sortByStream(map);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
}
