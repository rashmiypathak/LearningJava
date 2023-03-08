package javaSessions;

public class LearnMethod {
	
	//Method with 1 input parameter
	public int getStudentMarks(String studentName) { 
		
		System.out.println("Getting mark for student:" + studentName);
		switch (studentName) {
		case "Neha":
			return 100;
				
		case "Raj":
			return 80;
			
		case "Sushmita":
			return 70;
			
		default:
			System.out.println("Student not found");
			return -1;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethod obj = new LearnMethod();
		
		String names[] = {"Raj", "Rashmi", "Sushmita", "Neha"};
		for(int i=0; i<=names.length-1; i++) {
			int m = obj.getStudentMarks(names[i]);
			
			if(m == -1)
				System.out.println("Nothing to display");
			else
				System.out.println("Marks:"+m);
			
			System.out.println("-------------------");
		}

	}
	
	
		
	

}
