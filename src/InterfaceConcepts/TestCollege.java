package InterfaceConcepts;

public class TestCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymbiosisCollege s = new SymbiosisCollege();
		s.artificialIntelligenceDept();
		s.cinematographyDept();
		s.businessAdministrationDept();
		s.computerEnggDept();
		s.dataSceinceDept();
		
		s.grading();//implemented Grand Parent Interface
		s.payments("Rashmi");
		s.studentsRegistration(); // common method
		s.teacherRegistration();
		
		System.out.println("---------------------");
		USUniversity us = new SymbiosisCollege();
		us.artificialIntelligenceDept();
		us.businessAdministrationDept();
		us.studentsRegistration();
		us.grading();
		
		System.out.println("---------------------");
		IndianUniversity in = new SymbiosisCollege();
		in.englishLiteraturDept();
		in.cinematographyDept();
		in.mechanicalEnggDept();
		in.studentsRegistration();
		in.grading();
		
		System.out.println("-------------------");
		CentralUniversity c = new SymbiosisCollege();
		c.payments("Rashmi");
		c.teacherRegistration();
		
		
		System.out.println("----------------------");
		NITCollege n = new NITCollege();
		n.studentsRegistration();
		n.teacherRegistration();
		n.grading();
		n.artificialIntelligenceDept();
		n.payments("Richa");
				
		
		
		
			
			
				
		
		
	
		
		
	}

}
