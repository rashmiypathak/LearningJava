package assignments;

public class MethodsAssignment {
	
	//Question 1: Write a program to print the sum of two numbers entered by user by defining your own method
	public int getSum(int no1, int no2) {
		int sum = no1 + no2;
		return sum;
	}
	
	//Question 2:  Define a method that returns the product of two numbers entered by user.
	public int getProduct(int no1, int no2) {
		int product = no1 * no2;
		return product;
	}
	
//	Question 3: Write a program to print the circumference and area of a circle of radius 
//	entered by user by defining your own method. 
	
	public double getCircleArea(double radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
	
	public double getCircleCircumference(double radius) {
		double circum = 2 * 3.14 * radius;
		return circum;
	}
	
	//Question 4: Define two methods to print the maximum and the minimum number respectively among three numbers entered by user
	//Print Maximum Number
	public int getMaxNumber(int a, int b, int c) {
		if(a > b && a > c) {
			return a;
		}
		else if (b > c && b > a) {
			return b;
		}
		else 
			return c;
	}
	
	//Print Minimum Number
	public int getMinNumber(int a, int b, int c) {
		if(a < b && a < c) {
			return a;
		}
		else if (b < c && b < a) {
			return b;
		}
		else 
			return c;
	}
	
	//Question 5: Define a program to find out whether number is odd or even
	public boolean getEvenOddNumber(int no) {
		if(no%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Question 6: A person is eligible to vote if his/her age is greater than or equal to 18.  
	//Define a method to find out if he/she is eligible to vote
	
	public String getVotingEligibility(int age) {
		if(age >= 18) {
			return "Eligible";			
		}
		else
			return "Not Eligible";
	}	
		
	
	//Question 7: Define a method to find if number is prime or not
	public boolean isPrime(int number) {
		int i = 2;
		int r;
		while(i<10) {
			r=number%i;
			i++;
			if(r == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Question 8: Write a program which will ask user to enter his/her marks (out of 100).
	//Define a method that will display grades according to the marks entered as below:
	
	public String getGrades(int marks) {
		if(marks >= 91 && marks <= 100)
			return "AA";
		if(marks >= 81 && marks <= 90)
			return "AB";
		if(marks >= 71 && marks <= 80)
			return "BB";
		if(marks >= 61 && marks <= 70)
			return "BC";
		if(marks >= 51 && marks <= 60)
			return "CD";
		if(marks >= 41 && marks <= 50)
			return "DD";
		if(marks <= 40)
			return "FAIL";
		return null;
	}
	
	
	//Exercise 9: Find Factorial of given number
	public int getFactorial(int number) {
		System.out.println("Method called");
		for(int i = number-1 ; i >= 1; i--) {
			number = number * i;
		}
		return number;
	}
	
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsAssignment obj = new MethodsAssignment();
		
		//Ex 1:
		int sum = obj.getSum(45, 40);
		System.out.println("Sum of two numbers is " +sum);
		System.out.println("----------------------------");

		//Ex 2:
		int product = obj.getProduct(15, 3);
		System.out.println("Product of two numbers is " +product);
		System.out.println("----------------------------");
		
		//Ex 3:
		double r = 3;
		double area = obj.getCircleArea(r);
		System.out.println("Area for circle is " +area );
		
		double c = obj.getCircleCircumference(r);
		System.out.println("Circumference for circle is " +c);
		System.out.println("----------------------------");
		
		//Ex 4:
		int maxValue = obj.getMaxNumber(200, 201, 150);
		System.out.println("Maximum Number is : " +maxValue);
		
		int minValue = obj.getMinNumber(85, 7, 20);
		System.out.println("Minimum Number is : " +minValue);
		System.out.println("----------------------------");
		
		//Ex 5:
		int no = 13;
		Boolean value = obj.getEvenOddNumber(no);
		if(value == true) {
			System.out.println(no+ " is even number");
		}
		else
			System.out.println(no+ " is odd number");
		System.out.println("----------------------------");
		
		//Ex 6: 
		int age = 17;
		String checkEligible = obj.getVotingEligibility(age);
		if(checkEligible.equals("Eligible")) {
			System.out.println("You are eligible to vote");
		}
		else
			System.out.println("You are not eligible to vote, please vote when you are 18!");
		
		System.out.println("----------------------------");
		
		//Ex 7:
		if(obj.isPrime(19)){
			System.out.println("It is a prime number");
		}
		else
			System.out.println("It is not a prime number");
		System.out.println("----------------------------");
		
		//Ex 8:
		String grades = obj.getGrades(10);
		if(grades!=null){
			System.out.println("You got grade: " +grades);
		}
		else
			System.out.println("Please enter valid marks");
		System.out.println("----------------------------");
		
		//Ex 9:
		int factorial = obj.getFactorial(3);
		System.out.println("Factorial is: " +factorial);
		
		
	}

}
