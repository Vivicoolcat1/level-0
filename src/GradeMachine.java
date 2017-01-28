import javax.swing.JOptionPane;

public class GradeMachine {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
		
		String grade = JOptionPane.showInputDialog("What did you get on your test?");
		int grade1 = Integer.parseInt(grade);
		if (grade1 >= 90 && grade1 <= 100) {
			JOptionPane.showMessageDialog(null, "You got an A!!");
		}
		if (grade1 >= 80 && grade1 <= 89) {
			JOptionPane.showMessageDialog(null, "You got a B!");}
			if (grade1 >= 70 && grade1 <= 79) {
				JOptionPane.showMessageDialog(null, "You got a C");}
				if (grade1 >= 60 && grade1 <= 69) {
					JOptionPane.showMessageDialog(null, "You got a D :C");}
					if (grade1 >= 0 && grade1 <= 59) {
						JOptionPane.showMessageDialog(null, "You got a F :O ??");}
					}
				}
			
		
	
}
