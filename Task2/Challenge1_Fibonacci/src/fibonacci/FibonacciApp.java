package fibonacci;

import java.util.Scanner;

/***
 * @author Aiswarya
 *
 */
public class FibonacciApp {
    //This method will generate fibonacci series for a given number n.
	public static int generateFibonnacci(int n) {
		if (n <= 1) {
			return n;
		}
		else
		{	
		return generateFibonnacci(n - 1) + generateFibonnacci(n - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println("Please choose an option from Fibonnacci Menu : \n ");
		System.out.println("1: Find nth number in Fibonnacci Series \n");
		System.out.println("2: Check if a number is part of Fibonnacci Series \n");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("Enter the term value to get nth number" + "\n");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			if (n < 0) {
				System.out.println("Please enter a valid positive integer!");
			} else {
				System.out.println("Nth number in Fibonnacci is : " + generateFibonnacci(n));
			}
		} else if (choice == 2) {
			System.out.println("Enter the value to check if its a fibonnacci number" + "\n");
			int f = sc.nextInt();
			int index = 0, value = 0;
			while (generateFibonnacci(index) <= f) {
				value = generateFibonnacci(index);
				index++;
			}
			if (value == f) {
				System.out.println(f + "is a fibonnacci number with index :" + --index);
			} else {
				if ((f - generateFibonnacci(index - 1)) <= (generateFibonnacci(index) - f)) {
					        --index;
				}
				System.out.println(f + " is not a Fibonnacci Number. Closest index is : " + index);
			}
		} else {

			System.out.println("Invalid Selection !. Please choose a valid option from Menu");

		}

	}
}
