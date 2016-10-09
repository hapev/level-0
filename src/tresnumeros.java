import javax.swing.JOptionPane;

public class tresnumeros {
public static void main(String[] args) {
	String firstnumber = JOptionPane.showInputDialog("What is your number");
	String secondnumber = JOptionPane.showInputDialog("What is your second number");
	String thirdnumber = JOptionPane.showInputDialog("What is your third number");
	 int number1 = Integer.parseInt(firstnumber);
	int number2 = Integer.parseInt(secondnumber);
	int number3 = Integer.parseInt(thirdnumber);
	int HighestNumber = 0;
	int LowestNumber = 0;
	int MiddleNumber = 0;
	
	
	
//	
	
	
	if (number1 > number2&&number1 > number3){ 
		HighestNumber = 1;
	}
	else
	{
		if (number1 > number2 && number1 < number3||number1 < number2 && number1 > number3){
			MiddleNumber = 1;
			
			
		}
		else{
			LowestNumber = 1;
			
			
		}
		
		
	}
	
	
//	
	
	
	
	if (number2 > number1&&number2 > number3){ 
		HighestNumber = 2;
	}
	else
	{
		if (number2 > number1 && number2 < number3||number2 < number1 && number2 > number3){
			MiddleNumber = 2;
			
			
		}
		else{
			LowestNumber = 2;
			
			
		}
		
		
	}
	
//
	if (number3 > number1&&number3 > number2){ 
		HighestNumber = 2;
	}
	else
	{
		if (number3 > number1 && number3 < number2||number3 < number1 && number3 > number2){
			MiddleNumber = 2;
			
			
		}
		else{
			LowestNumber = 2;
			
			
		}
		
		
	}
	
	
}
}
