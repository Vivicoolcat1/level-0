
public class Potatoe {
	public static void main(String[] args) {
		for (int j = 0; j < 5; j++) {

			for (int i = 1; i < 9; i++) {
				if (i == 1) {
					System.out.print(i + " Potato, ");
				}

				else if (i == 4) {
					System.out.println("4,");
				} else if (i == 8) {

					System.out.println(" more!!!");
				} else {
					System.out.print(i + " Potatoes, ");
				}
			}
			System.out.println();
		}
	}

}