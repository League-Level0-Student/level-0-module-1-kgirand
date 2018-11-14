package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
String Answer1 = "A coffin";
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String Input1 = JOptionPane.showInputDialog("Who makes it, has no need of it. Who buys it, has no use for it. Who uses it can neither see nor feel it.  What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(Input1.equals(Answer1)) {
	JOptionPane.showInternalMessageDialog(null, "Correct! +1 point!");
	score ++;
	
	
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

