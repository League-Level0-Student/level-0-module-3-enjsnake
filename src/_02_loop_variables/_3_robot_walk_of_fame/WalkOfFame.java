
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot("batman");
		
		// 1. Set the X position of the robot so that it starts on the left. 
		rob.setSpeed(50);
		rob.penDown();
		// You also need to show the robot to see the result of this line.
		rob.setX(200);
		// 2. Make the robot draw a star shape. Hint: angle=144.
		for(int i=0; i<6; i++) {
			rob.move(30);
			rob.turn(144);
		}
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
