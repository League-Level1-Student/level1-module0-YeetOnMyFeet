package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot rob = new Robot();
	public void run() {
		rob.setX(75);
		rob.setY(500);

		drawHouse("small", "red");
		drawHouse("medium","blue");
		drawHouse("large","black");
		drawHouse("large","blue");
		drawHouse("small", "red");
		drawHouse("small","black");
		drawHouse("large", "blue");
		drawHouse("small","red");
		drawHouse("medium","black");
		drawHouse("large","blue");
		
		
		
	}
	public static void drawHouse(String size,  String color) {
		int height = 0;

	if (size.equals("small")) {
	height = 60;
	}
	if (size.equals("medium")) {
		height = 120;
	}
	if (size.equals("large")) {
		height = 250;
	}
	if (color.equals("blue")) {
		rob.setPenColor(0, 0, 255);
	}
	if (color.equals("green")) {
		rob.setPenColor(0,255,0);
	}
	if (color.equals("red")) {
		rob.setPenColor(255,0,0);
	}
		rob.penDown();
		rob.setPenWidth(5);
		rob.setSpeed(10);
		rob.move(height);
		if (size.equals("large")) {
			drawFlatRoof();
		}
		else {
			drawPointyRoof();
		}
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(0, 255, 0);
		rob.move(20);
		rob.turn(-90);
		

	}
	
	public static void drawPointyRoof() {
		
		rob.turn(45);
		rob.move(20);
		rob.turn(90);
		rob.move(20);
		rob.turn(45);
		
		
	}
	public static void drawFlatRoof() {
		rob.turn(90);
		rob.move(40);
		rob.turn(90);
	}
}
