package mathematicalOperationsJava;

public class LearnConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 85;
		if (marks <= 100) {
			System.out.println("Valid Marks");
			if(marks >= 90) {
				System.out.println("Grade A+");
				if(marks >=95) {
					System.out.println("Eligible for scholarship");
				}
			}
			else if(marks>=80) {
				System.out.println("Grade A");
			}
			else if(marks>=75) {
				System.out.println("Grade B");
			}
			else if(marks>=35) {
				System.out.println("Grade C");
			}
			else {
				System.out.println("Failed");
			}
		}
		else
		{
			System.out.println("Invalid Marks");
		}
				

	}

}
