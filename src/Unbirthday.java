import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	

String bday=JOptionPane.showInputDialog("What is your Birthday?(Month #)");
if(bday.equals("November 13")) {
JOptionPane.showMessageDialog(null, "Happy Birthday!");
}
else {
JOptionPane.showMessageDialog(null, "Happy UNbirthday!");	
}
}
}
