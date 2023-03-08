package assignments;

import java.util.Arrays;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeEncapsulationAssignment e1 = new EmployeeEncapsulationAssignment();
		e1.setName("Rashmi");
		e1.setAge(38);
		e1.setSalary(10);
		e1.setGender('F');
		e1.setActive(true);
		
		Object obj[] = e1.getEmployeeInfo();
		System.out.println(Arrays.toString(obj));
				
		System.out.println("---------------------");
		
		EmployeeEncapsulationAssignment e2 = new EmployeeEncapsulationAssignment();
		e2.setName("Yogu");
		e2.setAge(39);
		e2.setSalary(30);
		e2.setGender('M');
		e2.setActive(false);
		
		Object obj1[] = e2.getEmployeeInfo();		
		System.out.println(Arrays.toString(obj1));
		
		
		
	}

}
