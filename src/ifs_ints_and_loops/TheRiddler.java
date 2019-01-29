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
if(Input1.equalsIgnoreCase(Answer1)){
	JOptionPane.showMessageDialog(null, "Correct! +1 point!");
	score ++;
}
else{
JOptionPane.showMessageDialog(null, "Wrong! The answer is a coffin");
}

String Answer2 = "Nothing";
String Input2 = JOptionPane.showInputDialog("What is greater than God, more evil than the devil,the poor have it, the rich need it, and if you eat it, you'll die?");
if(Input2.equals(Answer2)) {
JOptionPane.showMessageDialog(null, "Correct! +1 point!");
score ++;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong! The answer is nothing");
}
String Answer3 = "An onion";
String Input3 = JOptionPane.showInputDialog("Take off my skin - I won't cry, but you will! What am I?");
if(Input3.equals(Answer3)) {
	JOptionPane.showMessageDialog(null, "Correct! +1 point!");
score ++;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong! The correct answer is an onion");
}
JOptionPane.showMessageDialog(null,"Congratulations! You finished with a score of " + score + " out of 3");
// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

