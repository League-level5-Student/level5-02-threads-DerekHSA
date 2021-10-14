package _02_Advanced_Robot_Race;

import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	ArrayList<Robot> robots = new ArrayList<Robot>();
	ArrayList<Thread> threads = new ArrayList<Thread>();
	public void start(){
		for (int i = 0; i < 4; i++) {
			robots.add(new Robot());
			robots.get(i).moveTo(300*(i+1), 750);
			robots.get(i).setSpeed((i+1)*2);
		}
		for (int i = 0; i < robots.size(); i++) {
			int index = i;
			threads.add(new Thread(()->{
				robots.get(index).move(1000);
			}));
		}
		for (int i = 0; i < threads.size(); i++) {
			threads.get(i).start();
		}
	}
}
