package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = JOptionPane.showInputDialog("Are you happy");
		if (answer.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null,"keep doing what you're doing");
		}
		else {
			answer = JOptionPane.showInputDialog("Do you want to be happy?");
			if (answer.equalsIgnoreCase("yes")){
				JOptionPane.showMessageDialog(null, "Change something");
			}
			
			else {
				JOptionPane.showMessageDialog(null,"keep doing what you're doing");
			}
		}
	}
}

