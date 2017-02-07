

	// Copyright Wintriss Technical Schools 2014
	import javax.swing.JOptionPane;

	/**
	 * Secret Message Box / Secure Messaging System
	 * 
	 * You want to leave a message on one of the Mac computers so that only your friend can read it.
	 * You set up the passcode and the secret message. 
	 * Your friend types in the passcode to retrieve the message.
	 * 
	 */

	public class SecretMessageBox {

		// 0. Make a main method and put steps 1-5 inside it
		public static void main(String[] args) {
			
		
		// 1. Set the passcode in a String variable
		String passcode =("HiStranger101");
		// 2. Using a pop-up, ask for a secret message and store it in a variable
String answer = JOptionPane.showInputDialog("what is the secret code?");
		// 3. Ask your friend for the passcode and store it in a variable

		// 4. If the passcode matches, show the secret message
if(answer .equals(passcode)){
	JOptionPane.showMessageDialog(null, "This is the secret message: Friends are like flowers if you pee on them they go away one good life tip:D don't pee on your friends kids!!");
	
}
		// 5. If the passcode does not match, pop-up "INTRUDER!!"
else{ JOptionPane.showMessageDialog(null, "INTRUDER why are you evan wasting your time too see one life hack wow!!");}
		// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.

	}



		}
