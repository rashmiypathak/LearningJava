package overridingConcepts;

public class Ford extends Cars{
	
	@Override
	public void start() {
		System.out.println("Ford - Starts");
	}
	
	public void color() {
		System.out.println("Ford - color");
	}
	
	public void airbags() {
		
	}

	
}
