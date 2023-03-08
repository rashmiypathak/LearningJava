package overridingConcepts;

public class Honda extends Cars {
	
	@Override
	public void stop() {
		System.out.println("Honda - stops");
	}
	
	public void color() {
		System.out.println("Hondo - color");
	}
	
	public void bootspace() {
		
	}
}
