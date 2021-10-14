package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {

	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot timmy = new Robot(500, 400);
		timmy.hide();
		Robot tammy = new Robot(600, 500);
		tammy.hide();
		Robot sammy = new Robot(700, 400);
		sammy.hide();
		Robot mike = new Robot(800, 500);
		mike.hide();
		Robot robert = new Robot(900, 400);
		robert.hide();
		int space = 3;
		int degrees = 2;

		Thread r1 = new Thread(() -> {
			timmy.setPenColor(Color.BLUE);
			timmy.penDown();
			timmy.setPenWidth(space);
			for (int i = 0; i < 360/degrees; i++) {
				timmy.move(space);
				timmy.turn(degrees);
			}
			
		});
		Thread r2 = new Thread(() -> {
			tammy.setPenColor(Color.YELLOW);
			tammy.penDown();
			tammy.setPenWidth(space);
			for (int i = 0; i < 360/degrees; i++) {
				tammy.move(space);
				tammy.turn(degrees);
			}
		});
		Thread r3 = new Thread(() -> {
			sammy.setPenColor(Color.BLACK);
			sammy.penDown();
			sammy.setPenWidth(space);
			for (int i = 0; i < 360/degrees; i++) {
				sammy.move(space);
				sammy.turn(degrees);
			}
		});
		Thread r4 = new Thread(() -> {
			mike.setPenColor(Color.GREEN);
			mike.penDown();
			mike.setPenWidth(space);
			for (int i = 0; i < 360/degrees; i++) {
				mike.move(space);
				mike.turn(degrees);
			}
		});
		Thread r5 = new Thread(() -> {
			robert.setPenColor(Color.RED);
			robert.penDown();
			robert.setPenWidth(space);
			for (int i = 0; i < 360/degrees; i++) {
				robert.move(space);
				robert.turn(degrees);
			}
		});
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
}
