package methodOverloadingAssignment;

public class Restaurant {
//	String phoneNumber;
//	String username;
//	String password;
//	int otp;
	
	public boolean login(String phoneNumber, String password) {
		return true;
	}
	
	public boolean login(String phoneNumber, int otp) {
		return true;
	}
	
	public boolean login(String userName, int otp, String password) {
		return false;
	}
	public boolean login(String phoneNumber, String password, int otp) {
		return true;		
	}
	
	public int search(String name) {
		return 100;
	}
	public String[] search(String name, String foodItem) {
		String foodList[] = {name, foodItem};
		return foodList;
		
	}
	public Object[] search(String name, String foodItem, double price) {
		Object foodList[] = {name,foodItem,price};
		return foodList;
		
	}
	public Object[] search(String name, String foodItem, double price, int rating) {
		Object foodList[] = {name, foodItem, price, rating};
		return foodList;
		
	}
	
}
