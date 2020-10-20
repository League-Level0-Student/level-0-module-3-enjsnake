package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("left or right");
		if (answer.equalsIgnoreCase("left")) {
			answer = JOptionPane.showInputDialog("up or down?");
			if(answer.equalsIgnoreCase("up")) {
				JOptionPane.showMessageDialog(null, "You ended up in top left");
		
			}
			else {
				JOptionPane.showMessageDialog(null, "You ended up in bottom left");
			}
		}
		else {
			answer= JOptionPane.showInputDialog("up or down?");
				if (answer.equalsIgnoreCase("up")) {
					JOptionPane.showMessageDialog(null, "You ended up in top right");
				
			}
				else {
					JOptionPane.showMessageDialog(null, "You ended up in bottom right");
				}
		}
	
	}

}
