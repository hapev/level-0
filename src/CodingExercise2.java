import javax.swing.JOptionPane;

public class CodingExercise2 {
public static void main(String[] args) {
	String age0 = JOptionPane.showInputDialog("What is your age?");
	int age = Integer.parseInt(age0);
	int year = 2016-age;
	JOptionPane.showMessageDialog(null, "You were born in "+year+".");
	if (age>30){
		JOptionPane.showMessageDialog(null, "You are too old to play this game.");
		}
	
	
	
	
}
}
