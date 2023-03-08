package assignments;

public class DataTypesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Question 1: Write a Java program to print 'Hello' on screen and then print
		// your name on a separate line.

		String name = "Rashmi";
		System.out.println("Hello");
		System.out.println(name);

		// Question 2: Write a Java program to print the sum of two numbers.
		// Test Data:  74 + 36

		byte num1 = 74;
		byte num2 = 36;
		System.out.println("Sum of numbers = " + (num1 + num2));

		// Question 3: Write a Java program to divide two numbers and print on the
		// screen.
		// Test Data: 50/3
		// Expected Output : 43 1  19  13

		int nume = 50;
		int deno = 3;
		System.out.println(nume / deno); // Discuss This
		

		// Question 4: Write a Java program to compute the specified expressions and
		// print the output
		// Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		double val1 = 25.5;
		double val2 = 3.5;
		double val3 = 40.5;
		double val4 = 4.5;

		double calc = ((val1 * val2 - val2 * val2) / (val3 - val4));

		System.out.println(calc);
		// System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

		// Question 5: Try to concat "Hello Selenium" with a character 't'

		String s1 = "Hello Selenium";
		char ch = 't';
		System.out.println(s1 + ch);

		/*
		 * Question 6: Create three int variables having values like : 100, 200, 3400.
		 * Add them and concatenate and generate this output String:
		 * "Your Total amount is. 3700".
		 */

		int i = 100;
		int j = 200;
		int k = 3400;
		int sum = i + j + k;
		System.out.println("Your Total amount is. " + sum);

		/*
		 * Question 7:Conditional Operators:
		 * Find out the greatest number out of three different given numbers:
		 * Input the 1st number: 25 
		 * Input the 2nd number: 78 
		 * Input the 3rd number: 87
		 */
		
		int a = 25;
		int b = 78;
		int c = 87;
		
		//Logic 1: Does not work if number is same
		if (a>b && a>c){
			System.out.println("Logic 1 - The greatest: "+a);
		}
		if (b>c && b>a) {
			System.out.println("Logic 1 - The greatest: "+b);
		}
		if (c>a && c>b){
			System.out.println("Logic 1 - The greatest: "+c);
		}
		
			
		//Logic 2: Does not work if number is same
		if(a>=b) {
			if(a>=c) {
				System.out.println("Logic 2 - The greatest: "+a);
			}
			else {
				
				System.out.println("Logic 2 - The greatest: "+b);
			}
		}
		else {
			if(b>=c) {
				System.out.println("Logic 2 - The greatest: " +b);
			}
			else {
				System.out.println("Logic 2 - The greatest: " +c);
			}
			
		}
		
		/*Question 8: Write a Java program to test a number is positive or negative.
		Test Data
		Input number: 35 -- positive number
		Input number: -11 -- negative number*/
		
		int number1 = 35;
		int number2 = -11;
		if(number1 >= 0) 
			System.out.println(number1+":"+"Positive number");
		else
			System.out.println(number1+":"+"Negative number");
		
		if(number2 >= 0) 
			System.out.println(number2+":"+"Positive number");
		else
			System.out.println(number2+":"+"Negative number");
		

	}

}
