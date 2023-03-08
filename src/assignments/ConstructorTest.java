package assignments;

import java.util.Arrays;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		 
		String[] plugin = {"TestNG", "Cucumber", "Maven"};
		 ConstructorAssignment obj = new ConstructorAssignment("chrome", 101.23,plugin);
		 
		 //get values
		 System.out.println(obj.getName());
		 System.out.println(obj.getVersion());
		 System.out.println(Arrays.toString(obj.getPlugin()));
		 
		 //set values
		 plugin[0] = "Plugin1";
		 plugin[1] = "Plugin2";
		 
		 obj.setName("firefox");
		 obj.setVersion(78);
		 obj.setPlugin(plugin);
		 
		 //get updated values
		 System.out.println("Updated Name: " +obj.getName());
		 System.out.println("Updated Version: " +obj.getVersion());
		 System.out.println(Arrays.toString(obj.getPlugin()));
		 
		 
		 //set University Values
		 String[] courses = {"Computer Engg", "Mechanical Engg", "Chemical Engg", "Structural Engg"};
		 UniversityAssignment u = new UniversityAssignment("Texas University", "USA", "25/12/2000", courses);
		 
		 System.out.println("University name is: " +u.getName());
		 System.out.println("University is located in county: " +u.getCountry());
		 System.out.println("University was established on :" +u.getEstablishedDate());
		 System.out.println("Following courses are provided at " +u.getName() +":" +Arrays.toString(u.getCourses()));
	}

}
