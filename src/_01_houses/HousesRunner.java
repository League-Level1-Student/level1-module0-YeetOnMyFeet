package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class HousesRunner {

	public static void main(String[] args) {
		//Here we call the run() method from the Houses class
		Houses houseBuilder = new Houses();
		houseBuilder.run();
		
	
		drawHouse(100);
		drawHouse(100);
		drawHouse(100);
		drawHouse(100);
		drawHouse(100);
		drawHouse(100);
		drawHouse(100);
		drawHouse(100);
		drawHouse(100);
		drawHouse(100);
		
	}
	public static void drawHouse(int height) {
		Robot rob = new Robot();
		rob.setX(75);
		rob.setY(500);
		rob.penDown();
		rob.setPenWidth(5);
		rob.setSpeed(10);
		rob.move(height);
		rob.turn(90);
		rob.move(40);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(0, 255, 0);
		rob.move(25);

	}
	}

