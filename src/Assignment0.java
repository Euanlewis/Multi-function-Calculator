import java.util.Scanner;

public class Assignment0 {

	private static void standardCalc() {
		boolean stayOption = true;
		while (stayOption == true){
			float number3;
			System.out.println("Standard Calculator");
			Scanner stanCalc = new Scanner(System.in);
			Scanner stanOption = new Scanner(System.in);
			System.out.println("Input your first number >>>");
			Float number1 = stanCalc.nextFloat();
			System.out.println("Input your second number >>>");
			Float number2 = stanCalc.nextFloat();
			System.out.println("Input either 'addition', 'multiplication', 'division' or 'subtraction' >>>");
			String operation = stanOption.nextLine();
			switch (operation) {
				case "addition":
					number3 = (number1 + number2);
					System.out.println(number1 + " + " + number2 + " = " + number3);
					break;
				case "multiplication":
					number3 = (number1 * number2);
					System.out.println(number1 + " * " + number2 + " = " + number3);
					break;
				case "division":
					number3 = (number1 / number2);
					System.out.println(number1 + " / " + number2 + " = " + number3);
					break;
				case "subtraction":
					number3 = (number1 - number2);
					System.out.println(number1 + " - " + number2 + " = " + number3);		
					break;
			}
			
			System.out.println ("Do you want to return to the main menu?");
			String leaving = stanOption.nextLine();
			switch (leaving) {
				case "yes":
					System.out.println ("Returning to main menu");
					stayOption = false;
					break;
				case "no":
					break;
			}
		}
	}
		    
	
	public static void main(String[] args) {
		System.out.println("Welcome to the calculator");
		System.out.println("Here are your options (insert number please)");
		System.out.println("1) Standard Calculator");
		Scanner choice = new Scanner(System.in);
		System.out.println("Input your choice >>>");
		int userChoice = choice.nextInt();
		switch (userChoice) {
		// This will be all the menu options
			case 1:
				standardCalc();
				break;
			case 2:
				//metricImperial();
				break;
		}
	}
}



