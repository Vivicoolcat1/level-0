import javax.swing.JOptionPane;

public class SimpleNumberOrders {
public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
		
	
	String numberA = JOptionPane.showInputDialog("Type in a number");
	int number1 = Integer.parseInt(numberA);
	String numberB = JOptionPane.showInputDialog("Type in a number");
	int number2 = Integer.parseInt(numberB);
    String numberC = JOptionPane.showInputDialog("Type in a number");
    int number3 = Integer.parseInt(numberC);
    if(number1 < number2 && number1 < number3 && number2 < number3 ){
    	System.out.println(number1);
    	System.out.println(number2);
    	System.out.println(number3);
    }
    if(number1 > number2 && number1 < number3 && number2 < number3 ){
    	System.out.println(number2);
    	System.out.println(number1);
    	System.out.println(number3);}
    if(number1 > number2 && number1 > number3 && number2 < number3 ){
    	System.out.println(number2);
    	System.out.println(number3);
    	System.out.println(number1);}
    if(number1 > number2 && number1 > number3 && number2 > number3 ){
    	System.out.println(number3);
    	System.out.println(number2);
    	System.out.println(number1);}
    if(number1 < number2 && number1 > number3 && number2 >number3 ){
    	System.out.println(number3);
    	System.out.println(number1);
    	System.out.println(number2);}
    if(number1 < number2 && number1 < number3 && number2 > number3 ){
    	System.out.println(number1);
    	System.out.println(number3);
    	System.out.println(number2);}


System.out.println("\n\n");

}

}
}