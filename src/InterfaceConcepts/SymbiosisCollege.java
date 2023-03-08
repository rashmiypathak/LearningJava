package InterfaceConcepts;

public class SymbiosisCollege extends CentralUniversity implements USUniversity, IndianUniversity, AustralianUniversity {

	@Override
	public void computerEnggDept() {
		System.out.println("Symbiosis implements Australian University-Comp Engg");
	}

	@Override
	public void dataSceinceDept() {
		System.out.println("Symbiosis implements Australian University-Data Science");
	}

	@Override
	public void cinematographyDept() {
		System.out.println("Symbiosis implements Indian University-Cinematography");
	}

	@Override
	public void mechanicalEnggDept() {
		System.out.println("Symbiosis implements Indian University-Mechanical Engg");
	}

	@Override
	public void englishLiteraturDept() {
		System.out.println("Symbiosis implements Indian University-English Literature");
	}

	@Override
	public void businessAdministrationDept() {
		System.out.println("Symbiosis implements US University-Business Administration");
	}

	@Override
	public void artificialIntelligenceDept() {
		System.out.println("Symbiosis implements US University-AI Dept");
	}

	//common method in all interfaces
	@Override
	public void studentsRegistration() {
		System.out.println("Symbiosis implements Student's Registration");
	}
	
	//Class override
	@Override
	public void payments(String name) {
		System.out.println("Symbiosis Payment-overridden from Central University");
	}
	
	//individual method
	public void library() {
		System.out.println("Symbiosis lab");
	}

	@Override
	public void grading() {
		System.out.println("Symbiosis grading implemented GP method");
		
		
	}

}
