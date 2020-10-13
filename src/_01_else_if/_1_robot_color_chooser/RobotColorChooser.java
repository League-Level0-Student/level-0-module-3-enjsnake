
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot("batman");
	    boolean loop = true;
		//2. Make the robot draw a shape (this will take more than one line of code)		
		rob.setSpeed(80);
		rob.penDown();
		for (int i = 0; i<4; i++) {
			rob.move(100);
			rob.turn(90);

		}
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		
		//5. Use an if/else statement to set the pen color that the user requested
        while (loop) {
        	String answer = JOptionPane.showInputDialog("what color would you like the robot to draw with?");
        if (answer.equalsIgnoreCase("exit")) {
        	break;
        }
        else if (answer.equalsIgnoreCase("red")) {
        	rob.setPenColor(255,0,0);
        }
        else if(answer.equalsIgnoreCase("Green")) {
        	rob.setPenColor(0, 255, 0);
        }
        else if(answer.equalsIgnoreCase("blue")) {
        	rob.setPenColor(0, 0, 255);
        }
        else {
        	rob.setRandomPenColor();
        }
		
		for (int i = 0; i<4; i++) {
			rob.move(100);
			rob.turn(90);

		}
		
        }
		//6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
