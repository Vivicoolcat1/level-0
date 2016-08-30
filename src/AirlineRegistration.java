


// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
String name = JOptionPane.showInputDialog("insert your first name");
String Lastname = JOptionPane.showInputDialog("insert your last name");
String DOB = JOptionPane.showInputDialog("insert date of birth ( we promise we aren't going to hack your credit card and steal your identity and be rich ;D)");	
String destination = JOptionPane.showInputDialog(" tell us where you will be traveling (you dont want to know why);D");
String Gender = JOptionPane.showInputDialog("What gender are you Male ,Female or both");	

	
		
	
JOptionPane.showMessageDialog(null, "Your name is " + name+ "\n your last name is " +Lastname+"\n your Date of birth " +DOB+"\n you will be going to " +destination+"\n your gender is " +Gender+"\n the amount of times you have done this is "+i);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}



/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
*/

