import org.jointheleague.graphical.robot.Robot;

public class Robotgraffiti {
	public static void main(String[] args) {

		Robot pam = new Robot("vic");
		pam.setSpeed(10);
		pam.setRandomPenColor();
		pam.setPenWidth(10);
		pam.moveTo(150, 100);
		pam.turn(150);
		pam.penDown();
		pam.move(700);
		pam.turn(-120);
		pam.move(700);
		pam.penUp();
pam.moveTo(1500, 100);
pam.turn(240);
pam.penDown();
pam.move(300);
pam.turn(-90);
pam.move(300);
pam.turn(-90);
pam.move(300);
pam.turn(90);
pam.move(300);
pam.turn(90);
pam.move(230);
	}

}