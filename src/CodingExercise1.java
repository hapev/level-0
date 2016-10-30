


import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.*;
public class CodingExercise1 {
public static void main(String[] args) {
	Robot John = new Robot();
	String colorChoice = JOptionPane.showInputDialog("Pick a color. Yellow or Blue.");
if (colorChoice.equals("Yellow"))
{
John.setPenColor(255,0,0);
}
else
{
John.setPenColor(0,0,255);
}
John.setPenWidth(10);
John.penDown();
John.setSpeed(100);
John.move(300);
John.turn(60);
John.move(300);
John.turn(60);
John.move(300);
John.turn(60);
John.move(300);
John.turn(60);
John.move(300);
John.turn(60);
John.move(300);



John.move(-300);
John.turn(60);
John.move(-300);
John.turn(60);
John.move(-300);
John.turn(60);
John.move(-300);
John.turn(60);
John.move(-300);
John.turn(60);
John.move(-300);

John.move(300);
John.turn(60);
John.move(-300);
John.turn(-60);
John.move(-300);
John.turn(-60);
John.move(-300);
John.turn(-60);
John.move(-300);
John.turn(-60);
John.move(-300);
John.turn(-60);
John.move(-300);

	
	
	
}
}
