import javax.swing.JOptionPane;

public class Riddles {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int Score =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String Answer1 = JOptionPane.showInputDialog("what two things cant  you have for breackfast?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if( Answer1.equals("lunch and dinner")){ 
	JOptionPane.showMessageDialog(null, "Correct");
		// 5. Otherwise, say "wrong" and tell them the answer
}else{ 
	JOptionPane.showMessageDialog(null, "wrong");
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,Score +"");
	}
	}
}





