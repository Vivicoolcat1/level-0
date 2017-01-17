
public class WriteAMethod {
public static void main(String[] args) {
	iRock("Vianne");
	int a = age (11);
	System.out.println(a);
	
	repeatString("Pi = 3.1415926535897932384626433", 8);
	 int b = multiply(8,8); 
	 System.out.println(b);
	 
}
	
	
	static void iRock(String yourName){
		System.out.println( yourName + " rocks!");
	}
	
	static int age (int yourAge){ 
		return 2016 - yourAge;
	}
	static void repeatString(String aString, int numOfTimesRepeatingYourString){
	for (int i = 0; i < numOfTimesRepeatingYourString ; i++) {
		System.out.println(aString);
	}
	
	}
	
	static int multiply(int number1, int number2){
		return 	 number1*number2;
	}
	
	
	
	
}

