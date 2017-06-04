//Import statement
import java.util.Scanner;
/** Counts down digits until 0 and prints fancy digit if countdown reaches less than 10 
 * @author  Hrishikesh Vyas-100271549 , Carlos Cabello- 100262333 
 * @version 1.0
 * Course:  CPSC 1150
 * Section: 005
 * Date:    February 26,2017
 * Asst:    6
 */
public class Timer {
	public static void main(String args[]) {

		//constants

		// MILLIS_PER_SEC: represent the number of milliseconds in one second.
		final int MILLIS_PER_SEC = 1000;
		// SECONDS_TO_WAIT: represent the number of milliseconds in one second.
		final double SECONDS_TO_WAIT = 1;
		// MILLIS_TO_WAIT: represents the number of millisencods 
		final long MILLIS_TO_WAIT = (long)(SECONDS_TO_WAIT * MILLIS_PER_SEC);

		//variables

		//seconds: stores information about where to begin the countdown
		int seconds;
		//disp: A character or string which can be used in displaying the number
		String disp;
		//startTime: holds the system time in millisencods.
		long startTime;

		//scanners

		//Scanner sc: To hold the number of seconds entered by user
		Scanner sc = new Scanner(System. in );

		//Scanner input: To hold the chracter or string user wants to use as fancy digits
		Scanner input = new Scanner(System. in );

		//inputs

		//Prompting user to enter a digit to begin countdown
		System.out.println("Please enter a number of seconds to count down:");
		//storing user entered input in seconds
		seconds = sc.nextInt();

		//Prompting user to enter a string or character
		System.out.println("Please enter a character or String to use in displaying the number:");
		//Storing the user entered string or character in disp
		disp = input.nextLine();

		//computing
		//Prinitng information about initiation of the countdown
		System.out.println("Beginning countdown!");

		//while loop to print a digit every second until digits are reduced to zero
		while (seconds >= 0) {

			//if condition to print digits normally if they are greater than or equal to zero
			if (seconds >= 10) {
				System.out.println(seconds);
			}

			//else condtion to print fancy digits if digits are less than 10            
			else {
				//calling printDigit method from Fancy.java program and passing seconds and disp as parameters
				Fancy.printDigit(seconds, disp);
				//printing every digit on new line for readability of digits
				System.out.println("\n");
			}

			//reducing while loop every second until digits reach less than zero   
			seconds--;
			//store the time in milliseconds before the waiting time
			startTime = System.currentTimeMillis();
			// The while empty loop functions as a delayer, it interrups the execution flow for a period of time.

			// Inside the condition statemet, it substracts the current time minus the start time.

			// When the difference between the current time and the start time is equal to the time to wait
			// the program moves the execution flow forward.
			while (System.currentTimeMillis() - startTime < MILLIS_TO_WAIT);
		}

		sc.close();
		input.close();
	} //end main
} //end class
