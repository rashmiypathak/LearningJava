package InterfaceConcepts;

public class NITCollege extends CentralUniversity implements USUniversity, IndianUniversity{

	@Override
	public void grading() {
		System.out.println("NIT College grading implements GP method");
		
	}

	@Override
	public void cinematographyDept() {
		System.out.println("NIT College implements Indian Uni - Cinematography");		
	}

	@Override
	public void mechanicalEnggDept() {
		System.out.println("NIT College implements Indian Uni - Mechanical Engg");		
	}

	@Override
	public void englishLiteraturDept() {
		System.out.println("NIT College implements Indian Uni - Literature");
		
	}

	@Override
	public void businessAdministrationDept() {
		System.out.println("NIT College implements US Uni - Business Administration");
		
	}

	@Override
	public void artificialIntelligenceDept() {
		System.out.println("NIT College implements Indian Uni - AI");
		
	}

	@Override
	public void studentsRegistration() {
		System.out.println("NIT College implements common student registation");
		
	}
	

}
