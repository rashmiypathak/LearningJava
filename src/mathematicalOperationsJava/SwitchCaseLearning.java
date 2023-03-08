package mathematicalOperationsJava;

public class SwitchCaseLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "edge";
		switch (browser) {
		case "chrome":
			System.out.println("chrome is launched");
			break;
		
		case "firefox":
			System.out.println("firefox is launched");
			break;
			
		default:
			System.out.println("invalid browser");
			break;
		}
		
		char ch = 's';
		switch (ch) {
		case 'a', 'e', 'i', 'o', 'u':
			System.out.println("Vowels");
			break;
		
		default:
			System.out.println("Not a vowel");
			break;
		}

	}
	
	

}
