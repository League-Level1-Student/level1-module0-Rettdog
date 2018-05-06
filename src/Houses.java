import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
public static void main(String[] args) {
	Houses house = new Houses();
	house.start();
	
}
public void start() {
	
	rob.setX(30);
	house("small",Color.red);
	house("medium",Color.blue);
	house("small",Color.cyan);
	house("large",Color.blue);
	house("small",Color.YELLOW);
	house("medium",Color.DARK_GRAY);
	house("large",Color.black);
	house("small",Color.white);
	
	
	
}
public void house(String height, Color color) {
	int heightint = 0;
if(height.equals("small")) {
	heightint=60;
}else if(height.equals("medium")) {
	 heightint=120;
}else if(height.equals("large")) {
	 heightint=250;
}
	rob.setPenColor(color);
	rob.setSpeed(500);
	rob.penDown();
	rob.move(heightint);
	
	if(height.equals("large")) {
		flatRoof();
	}else {
		pointedRoof();
	}
	rob.move(heightint);
	rob.turn(-90);
	rob.setPenColor(0,255,0);
	rob.move(30);
	rob.turn(-90);

	
}
public void flatRoof() {
	rob.turn(90);
	rob.move(40);
	rob.turn(90);
}
public void pointedRoof() {
	rob.turn(45);
	rob.move(28);
	rob.turn(90);
	rob.move(28);
	rob.turn(45);
}
	
}
