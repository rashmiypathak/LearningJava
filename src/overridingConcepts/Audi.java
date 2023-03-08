package overridingConcepts;

public class Audi extends Cars {
	
	@Override
	public void start() {
		System.out.println("Audi Starts");
	}
	
	@Override
	public void stop() {
		System.out.println("Audi Stops");
	}
	
	
	public void audio() {
		System.out.println("Audi audio");
	}

}
