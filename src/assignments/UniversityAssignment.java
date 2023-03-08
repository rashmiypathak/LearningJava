package assignments;

public class UniversityAssignment {
	String name;
	String country;
	String establishedDate;
	String[] courses;
	
	public UniversityAssignment(String name, String country, String establishedDate, String[] courses) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.courses = courses;
	}

	public UniversityAssignment(String name, String country, String[] courses) {
		this.name = name;
		this.country = country;
		this.courses = courses;
	}

	public UniversityAssignment(String name, String country, String establishedDate) {
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public String getEstablishedDate() {
		return establishedDate;
	}

	public String[] getCourses() {
		return courses;
	}
	
	
	
	
	

}
