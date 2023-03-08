package methodOverloadingAssignment;

import java.util.Arrays;

public class RestaurantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant r = new Restaurant();
		System.out.println(r.search("Bird Valley"));
		
		String[] foodList = r.search("Bird Valley", "Veg Machurian");
		System.out.println(Arrays.toString(foodList));
		
		Object[] foodList1 = r.search("Bird Valley" , "Tandoori Paneer", 350);
		System.out.println(Arrays.toString(foodList1));
		
		Object[] foodList2 = r.search("Tatva", "Veg Pizza", 450, 4);
		System.out.println(Arrays.toString(foodList2));	
		

	}

}
