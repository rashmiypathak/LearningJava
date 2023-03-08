package assignments;

public class LoopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Question 1 - Write a program to print following output:
		I am Batman
		I am Batman
		I am Batman
		I am Batman
		I am Batman */
		
		for(int i = 1; i<=5; i++) {
			System.out.println("I am batman");
		}
		System.out.println("-----------------------------------------");
		
		
		/* Question 2 - Write a program to print following output:
		I am Batman1
		I am Batman2
		I am Batman3
		I am Batman4
		I am Batman5
		I am Batman6
		I am Batman7
		I am Batman8
		I am Batman9*/
		
		for(int i = 1; i<10; i++) {
			System.out.println("I am batman"+i);
		}
		System.out.println("-----------------------------------------");		
		
		
		// Question 3 - WAP to print 10 to 1 using for, while and do-while loop
		//for loop:
		System.out.println("For Loop Result");
		for (int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		//while loop:
		System.out.println("While Loop Result");
		int j = 10;
		while(j > 0) {
			System.out.println(j);
			j--;
		}
		
		//do while loop;
		int k = 10;
		System.out.println("Do While Loop Result");
		do {
			System.out.println(k);
			k--;
		}while(k>0);
		System.out.println("-----------------------------------------");
		

		//Question 4 - Write a program in Java to print "Hello World" ten times using while loop
		int i = 1;
		while(i<=10) {
			System.out.println("Hello World!");
			i++;
		}
		System.out.println("-----------------------------------------");
		
		
		//Question 5 - Write a program in Java to print 1 to 10 using while loop
		int num = 1;
		while(num<=10) {
			System.out.println(num);
			num++;
		}
		System.out.println("-----------------------------------------");
		
		
		/* Question 6 - WAP to find out the max number from the given three different positive numbers
		 * num1 = 100
		 * num2 = 200
		 * num3 = 300 */
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		
		
		
		//Question 7 - Print all odd and even numbers between 1 to 100
		//odd numbers
		System.out.println("----------Odd Numbers---------");
		for(int odd = 1; odd<=100;) {
			System.out.println(odd);
			odd=odd+2;
		}
		
		//even numbers
		System.out.println("----------Even Numbers---------");
		for(int even = 0; even<=100;) {
			System.out.println(even);
			even=even+2;
		}
		System.out.println("-----------------------------------------");
		
		
		/* Question 8 - What will be the output of this program:
		int i = 1;
		while(i<=1)
		System.out.println("Hi Java"); */
		//Answer: Infinite Loop that will print Hi Java
		
		
		// Question 9 - Print A-Z , a-z, 0-9 with the respective ASCII numbers on the console using while and for loop.
		
		//while loop
		System.out.println("ASCII VALUE USING WHILE LOOP");
		char smallAlpha = 'a';
		while(smallAlpha <= 'z') {
			System.out.println("WHILE LOOP - Ascii Value for "+smallAlpha+ ":"+ (int)smallAlpha);
			smallAlpha++;
		}
		
		char capitalAlpha = 'A';
		while(capitalAlpha <= 'Z') {
			System.out.println("WHILE LOOP - Ascii Value for "+capitalAlpha+ ":"+ (int)capitalAlpha);
			capitalAlpha++;
		}		
		
		char number = '0';
		while(number <= '9') {
			System.out.println("WHILE LOOP - Ascii Value for "+number+ ":"+ (int)number);
			number++;
		}
		
		
		// For loop
		System.out.println("ASCII VALUE USING FOR LOOP");
		
		for(char fsmallAlpha = 'a'; fsmallAlpha <= 'z'; fsmallAlpha++) {
			System.out.println("FOR LOOP - Ascii Value for " + fsmallAlpha + ":" + (int) fsmallAlpha);
		}

		for(char fcapitalAlpha = 'A'; fcapitalAlpha <= 'Z'; fcapitalAlpha++) {
			System.out.println("FOR LOOP - Ascii Value for " + fcapitalAlpha + ":" + (int) fcapitalAlpha);
		}

		for(char fnumber = '0'; fnumber <= '9'; fnumber++) {
			System.out.println("FOR LOOP - Ascii Value for " + fnumber + ":" + (int) fnumber);
		}
		System.out.println("-----------------------------------------");
		
	
		/* Question 10 - Print the following series: 
		 * 1.0 2.0 3.0  ...... 10.0 
		 * 0 5 10 15 20 25 …. 100 */
		
		//print 1.0 2.0 3.0 4.0 5.0 
		for(double d = 1.0; d<=10.0; d++) {
			System.out.print(d+ " ");
		}
		  
		//print 0 5 10 15 20
		System.out.println();
		for(int m=0; m<=100; m++) {
			if(m%5==0) {
				System.out.print(m+ " ");
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		
		
		// Question 11 - Print only vowels (aeiou) using for and while loop. Start the loop from 'a' to 'z'.
		//for loop
		System.out.println("VOWELS USING FOR LOOP");
		for(char alpha = 'a'; alpha <= 'z'; alpha++) {
			if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
			System.out.println(alpha);
			}
		}
		
		//while loop
		System.out.println("VOWELS USING WHILE LOOP");
		char beta = 'a';
		while(beta <= 'z') {
			switch (beta) {
			case 'a', 'e', 'i','o', 'u':
				System.out.println(beta);
				break;
			default:
				break;
			}
			beta++;
		}
		System.out.println("-----------------------------------------");
		
	
		/* Question 12 - Print 1 to 10 and break the loop once you find the multiplication of 7 with a message
		"bye, see you tomorrow" */
		
		for(int no = 1; no <= 10; no++) {
			System.out.println("Number is "+no);
			if(no%7 == 0) {
				System.out.println("Bye, see you tomorrow");
				break;
			}
		}
		System.out.println("-----------------------------------------");
		
		/* Question 13 - Write a cricket score card system using for and while loops:
		 * if(score == 0) -- print - "Zero - duck"
		 * if(score == 25) -- print - "good job"
		 * if(score == 50) -- print - "good job - half century"
		 * if(score == 100) -- print - "good job - century" */
		
	
		//for loop
		System.out.println("Using For Loop");
		int score = 0;
		for(score = 0; score <= 100; score++) {
			switch (score) {
			case 0:
				System.out.println("Zero - duck");
				break;
			
			case 25:
				System.out.println("Good Job");
				break;
				
			case 50:
				System.out.println("Good job - Half Century");
				break;
			
			case 100:
				System.out.println("Good job - Century");
				break;

			default:
				break;
			}
		}
		
		//while loop
		System.out.println("Using While Loop");
		int wscore = 0;
		while(wscore <= 100) {
			if(wscore == 0) {
				System.out.println("Zero - Duck");
			}
			else if(wscore == 25) {
				System.out.println("Good Job");
			}
			else if(wscore == 50) {
				System.out.println("Good job - Half Century");
			}
			else if(wscore == 100) {
				System.out.println("Good job - Century");
			}
			wscore++;
		}
	
	}

}
