package assignments;

public class EmployeeEncapsulationAssignment {
	private String name;
	private int age;
	private int salary;
	private boolean isActive;
	private char gender;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	/*public void getEmployeeInfo() {
		System.out.println("Emp Name: " +name);
		System.out.println("Emp Age: " +age);
		System.out.println("Emp Gender: " +gender);
		System.out.println("Emp salary: " +salary);
		System.out.println("Is Emp Active: " +isActive);
	}*/
	
	public Object[] getEmployeeInfo() {
		Object EmpInfo[] = {name, age, gender, salary, isActive};
		return EmpInfo;
		
	}
	
	//name, age, salary, isActive, gender

}
