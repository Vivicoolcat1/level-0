import org.jointheleague.graphical.robot.Robot;

public class cube {
public static void main(String[] args) {
	Robot robo = new Robot("batman");
	robo.setSpeed(10);
	robo.penDown();
	for (int i = 0; i < 4; i++) {
		robo.move(200);
		robo.turn(90);
	}
	robo.turn(60);
	robo.move(200);
	robo.turn(-60);

		robo.turn(90);
		robo.move(200);
	
	robo.turn(150);
	robo.move(200);
	
	robo.turn(120);
	robo.move(200);
	
	robo.turn(60);
	robo.move(200);
	

	robo.turn(-150);
	robo.move(200);
	

	robo.turn(-30);
	robo.move(200);
	

	robo.turn(180);
	robo.move(200);
	
	
	
	
	
}
}
