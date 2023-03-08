package mathematicalOperationsJava;

public class LoopsConcept {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=50; i++) {
			System.out.println(i+" Bye!!");
		}
		
		int j=1;
		for (;;j++) {
			System.out.println(j+". "+ "Hello there!!");
			if(j == 50) {
				System.out.println("Bye loop");
				break;				
			}
		}
	}
	

}
