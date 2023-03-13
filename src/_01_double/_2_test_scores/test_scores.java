package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test_scores {

	
	public static void main(String[] args) {
	
	String score = JOptionPane.showInputDialog("What score did you get on your test?");
	double testscore = Double.parseDouble(score);
	if (testscore > 85) {
		JOptionPane.showMessageDialog(null, "Wow, thats amazing! You must have studied really hard for that test!");
	}
	if (testscore < 85 && testscore > 70) {
		JOptionPane.showMessageDialog(null, "That's a good score! good job!");
	}
	if (testscore < 70 && testscore > 50) {
		JOptionPane.showMessageDialog(null, "It's alright");
	}
	if (testscore < 50 && testscore > 45) {
		JOptionPane.showMessageDialog(null, "You tried your best!");
	}
	if (testscore < 45 && testscore > 35) {
		JOptionPane.showMessageDialog(null, "Did you study?");
	}
	if (testscore < 35) {
		JOptionPane.showMessageDialog(null, "Did you even try?");
	}
	 
		
		
	}	
	
}
