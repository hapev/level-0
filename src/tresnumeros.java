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

		if (number1 > number2 && number1 > number3) {
			HighestNumber = number1;
		} else {
			if (number1 > number2 && number1 < number3 || number1 < number2 && number1 > number3) {
				MiddleNumber = number1;

			} else {
				LowestNumber = number1;

			}

		}
		//

		if (number2 > number1 && number2 > number3) {
			HighestNumber = number2;
		} else {
			if (number2 > number1 && number2 < number3 || number2 < number1 && number2 > number3) {
				MiddleNumber = number2;
			} else {
				LowestNumber = number2;
			}
		}

		if (number3 > number1 && number3 > number2) {
			HighestNumber = number3;
		} else {
			if (number3 > number1 && number3 < number2 || number3 < number1 && number3 > number2) {
				MiddleNumber = number3;
			} else {
				LowestNumber = number3;
			}
		}

		System.out.println(LowestNumber);
		System.out.println(MiddleNumber);
		System.out.println(HighestNumber);
		System.out.println(HighestNumber);
		System.out.println(MiddleNumber);
		System.out.println(LowestNumber);

	}
}
