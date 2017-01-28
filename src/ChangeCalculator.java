import javax.swing.JOptionPane;

public class ChangeCalculator {
	public static void main(String[] args) {
		String numOfDimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes = Integer.parseInt(numOfDimes);

		String numOfQuarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int quarters = Integer.parseInt(numOfQuarters);

		String numOfNickels = JOptionPane.showInputDialog("How many nickels do you have?");
		int nickels = Integer.parseInt(numOfNickels);

		String numOfDollars = JOptionPane.showInputDialog("How many dollars do you have?");
		int dollars = Integer.parseInt(numOfDollars);
		double total = (dimes * 10 + nickels * 5 + quarters * 25 + dollars * 100);
		JOptionPane.showMessageDialog(null, "this is how much you have " + total);
		String sandwich =JOptionPane.showConfirmDialog(null, "would you like a sandwich its only $1.50", JOptionPane.YES_NO_OPTION);
		if (total> 50 && sandwich .equals(JOptionPane.YES_OPTION)){ 
			JOptionPane.showMessageDialog(null,"Here is your sandwich that is $1.50");}
			
		}

	}

}
