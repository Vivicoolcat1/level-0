import javax.swing.JOptionPane;

public class MATH {
 public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "this is the super math machine it will solve any addition problems for realz");
String num1 = JOptionPane.showInputDialog("pick a number between 1 and 1,000,000");

String num2 = JOptionPane.showInputDialog("pick another number between 1 and 1,000,000"); 
 JOptionPane.showMessageDialog(null, "Beep Bop Beep Boop");
int num4 = Integer.parseInt(num2); 
int num3 = Integer.parseInt(num1); 
 int num5 = num3 + num4;
 JOptionPane.showMessageDialog(null, "your sum is" + num5);
 
 
 
 
 
 
 }
}
