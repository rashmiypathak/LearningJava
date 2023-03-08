package overridingConcepts;

public class Cars extends Vehicle{
	String type; //sedan, suv, hatchback
	int priceRange;
	boolean sunRoof;
	
		
	public void start() {
		System.out.println("Car Starts");
	}
	
	public void stop() {
		System.out.println("Car Stops");
	}
	
	public void seats() {
		System.out.println("Car Seats");
	}
	
	public final void engine() {
		System.out.println("Cars engine");
	}
}
