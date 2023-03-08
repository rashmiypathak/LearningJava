package assignments;

public class Reverse {
	//reverse given int
	
	public static void reverseInt() {
		int no = 45210;
		
		while(no>0) {
		int rev;
		rev = no%10;
		no = no/10;
		
		System.out.print(rev);
		//System.out.print(no);
	}
	}
	
	public static void main(String args[]) {
		reverseInt();
	
		
	}
}


