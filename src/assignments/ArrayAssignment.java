package assignments;

import java.util.Arrays;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Question 1: Write a program to print the following pattern using for loop:
		 * 
		 *                00 01 02 03 04 05 06 07 08 09 
		 * 
		 *                10 11 12 13 14 15 16 17 18 19 
		 * 
		 *                20 21 22 23 24 25 26 27 28 29 
		 * 
		 *                30 31 32 33 34 35 36 37 38 39
		 * 
		 *        
		 */
		
		for(int i = 0; i<=3; i++) {
			for(int j = 0; j<=9; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		/*Question 2: Write a program to create a static Array, having following cricket data:
		--name, age, team name, DOB, gender, Strike Rate
		--Try to create multiple Object Arrays for different players 
		--Try to print all the values of each player on the console*/
		Object player[] = new Object[6];
		player[0] = "Rohit Sharma";
		player[1] = 35;
		player[2] = "India";
		player[3] = "30th April, 1987";
		player[4] = 'M';
		player[5] = 74.13;
		
		Object player1[] = {"K L Rhaul", 30, "India", "18th April 1992", 'M', 57.15};
		Object player2[] = new Object[6];
		player2[0] = "Mithali Raj";
		player2[1] = 39;
		player2[2] = "India";
		player2[3] = "3rd December 1982";
		player2[4] = 'F';
		player2[5] = 69.15;
		
		System.out.println(Arrays.toString(player));
		System.out.println(Arrays.toString(player1));
		System.out.println(Arrays.toString(player2));
		
		
		Object player3[] = {"Kane Williamson", 35, "New Zealand", "15th January 1987", 'F', 72.65};

		for(Object e : player3) {
			System.out.println(e);
		}

		System.out.println("-------------------------------------");
		/*
		 * Question 3: Try to print the following pattern on the console:
		 * 
		 *    n = 4           
		 *    n = 3
		 *    n = 2
		 *    n = 1 
		 *    n = 0
		 */
		for(int i = 4; i >=0; i-- ) {
			System.out.println("n = " +i);
		}
		
		//Using Array
		System.out.println("Using Array");
		int n[] = new int[5];
		n[0] = 0;
		n[1] = 1;
		n[2] = 2;
		n[3] = 3;
		n[4] = 4;
		
		for(int i = n.length-1; i>=0; i--) {
			System.out.println("n = " +n[i]);
		}
		
	}

}
