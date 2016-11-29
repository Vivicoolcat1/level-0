
public class EvanOdd {
 public static void main(String[] args) {
	for (int i = 1; i <= 500 ; i++) {
		if((i % 3) == 0){
			System.out.println(i + "It is divisible by 3");
		}
		else{
			System.out.println(i + "It is not divisible by 3");
		}
	}
}
}
