import java.util.Scanner;

public class Group45 {
	//Assigned variables and created scanner
	static double x,y;
	//these two variables will be used during calculations and to store user input values as well.
	static int choiceOption;
	//this variable stores the data for which mode of operation is to be used. Also collected from user.
	static boolean stayOption;
	//this variable is being used to run the while loop.
	static int cont;
	//variable to be collected from user. used to determine if program has to re-run.
	static Scanner scan = new Scanner(System.in);  // creating an instance of the scanner class.	    
	//these variables will be used within the calculator program.
	//static int inputContinue;
	static int Display;
	// this variable will display the first input process within the calculator.
	
	private static void standardCalculator() {
		//boolean was made as there are only 2 outputs allowed
		boolean stayOption = true;
		while (stayOption == true){
			//All numbers are floats to allow the user to use decimals
			float number3;
			System.out.println("Standard Calculator");
			// One scanner for strings and one for floats
			Scanner stanCalc = new Scanner(System.in);
			Scanner stanOption = new Scanner(System.in);
			System.out.println("Input your first number >>>");
			Float number1 = stanCalc.nextFloat();
			System.out.println("Input your second number >>>");
			Float number2 = stanCalc.nextFloat();
			System.out.println("Input either 'addition', 'multiplication', 'division' or 'subtraction' >>>");
			String operation = stanOption.nextLine();
			//switch to allow user to choose an option they desire
			switch (operation) {
				case "addition":
					//This adds the 2 numbers together and puts it into a 3rd variable
					number3 = (number1 + number2);
					System.out.println(number1 + " + " + number2 + " = " + number3);
					break;
					//This multiplies the 2 numbers together 
				case "multiplication":
					number3 = (number1 * number2);
					System.out.println(number1 + " * " + number2 + " = " + number3);
					break;
					//This divides number 1 from number 2
				case "division":
					number3 = (number1 / number2);
					System.out.println(number1 + " / " + number2 + " = " + number3);
					break;
					//This subtracts number 1 from number 2
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
	
	
	private static void metricImperial() { 
        stayOption = true; //this will be used to create the while loop
        
        //I am creating a while loop here in order to allow the user to return to the start of my program.
        while (stayOption==true) {
        //I am creating the menu for my application
    	    System.out.println("Welcome to the Metric and Imperial unit converter!"+"\n\n"+"Please select one of the following options:\n");
            System.out.println("To convert Cm to inches, Input number ---> 1"+"\n");
            System.out.println("To convert Inches to Cm, Input number ---> 2"+"\n");
            System.out.println("To convert g to Oz, Input number ---> 3"+"\n");
            System.out.println("To convert Oz to g, Input number ---> 4"+"\n");
        
        //Requesting input using scanner
       
            choiceOption = scan.nextInt();
       
        //switch board for different operation modes      
       
            switch (choiceOption)	{
        
                case (1): //Cm to Inches
        	      System.out.println("\n Input Length in Cm");
        	      x = scan.nextDouble();
        	      y = x / 2.54;
        	      System.out.println("\n Length = "+y+" inches");
                break;
                case (2): //Inches to Cm
        	      System.out.println("\n Input Length in Inches");
	              x = scan.nextDouble();
        	      y = x * 2.54;
        	      System.out.println("\n Length = "+y+" Cm");
                break;
                case (3): //Grams to Ounces
        	      System.out.println("\n Input Mass in grams");
	              x = scan.nextDouble();
        	      y = x / 28.3459;
        	      System.out.println("\n mass = "+y+" Ounces");
                break;
                case (4): //Ounces to Grams
        	      System.out.println("\n Input Mass in Ounces");
	              x = scan.nextDouble();       	
        	      y = x * 28.3459;
        	      System.out.println("\n mass = "+y+" grams");
                break;
 		        default : //In case anything other than 1-4 entered by user
 			      System.out.println(" Oops!! Invalid Character was entered!");

            }
            // once the program has been completed, the following will run to ask user if they would like to continue
            System.out.println("\n\n Continue? \n Input number '1' for yes \n or \n input number '2' for no");
            cont = scan.nextInt();
            if(cont==1) {
            	
            	System.out.println("\n\n\n\n");
 	            //while loop uninterrupted and program will loop back to start of operation mode select.
            } 
            else if (cont==2) {
                stayOption = false;
                System.out.println("\n\n Thank you for using my program!\n\n Program has ended"); 
                //While loop will be interrupted, program will end and return to the Main menu
          
            }//ending if statement
       
        }//Closing while loop
    
    }//Closing main method  
    
	private static void decimalBinary() 
	{
		boolean contdecision;
		int inputdecision=0;
		
		//welcome message
		System.out.println("Decimal To Binary Converter.");
		
		//loop to continue calculation
		while (contdecision = true)
		{

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Decimal Number: ");
			int inputnumber = sc.nextInt();
			
			
			String binary = "";
			int temp = inputnumber;
			
			//loop that performs calculation
			while(temp>0)
			{
				int remainder = temp % 2;
				temp = temp / 2;
				binary = remainder + binary;
			}
			
			System.out.println("Binary Value = " + binary);
			
			//ignore these (test purposes)
			/*
			if (contdecision = false)
			{
				break;
			}
			*/
			
			//scanner that receives input from user on whether they wish to continue or not.
			Scanner sc2 = new Scanner(System.in);
			
			System.out.println("Do you wish to continue? 1=Yes/2=No");
			inputdecision = sc2.nextInt();
			
			
			//this if statement: when entered 1 will loop the converter
			//when entered 2 it should terminate
			if (inputdecision != 1)
			{
				break;
			}
		}
		
		
	}
    
		
	private static void temperature(){
        //I have put all of the main method into a loop so that it can be exited at the end.
		boolean exit = false;
		while(!exit) {

			Scanner input = new Scanner(System.in);
			System.out.println("If you want to convert Celsius to Fahrenheit enter (1), or if you want to convert Fahrenheit to Celsius enter (2) ");

			int option = 0;
			boolean errorCheck;

        // The section below validates the user input to make sure its either 1 or 2.
			do {
				if (input.hasNextInt(1 | 2)) {
					option = input.nextInt();
					errorCheck = true;
				} else {
					System.out.println("Error! Enter 1 or 2");
					errorCheck = false;
					input.next();
				}

			} while (!(errorCheck));


			//The section below calls either the celsiusToFahrenheit or fahrenheitToCelsius function.

			if (option == 1) {
				celsiusToFahrenheit();

			}
			if (option == 2) {
				fahrenheitToCelsius();
			}

			//In the section below is the exit function, I created another user input validation function and an if statement to either repeat the main method or exit it.
			Scanner exitInput = new Scanner(System.in);
			System.out.println("Do you wan to convert another temperature? Enter 1 for Yes or 2 for No");
			int exitOption = 0;
			boolean errorCheck2;

			do{
				if (exitInput.hasNextInt(1 | 2 )){
					exitOption = exitInput.nextInt();
					errorCheck2 = true;
				}else{
					System.out.println("Error! Enter 1 or 2");
					errorCheck2 = false;
					exitInput.next();
				}

			}while (!(errorCheck2));

			if (exitOption == 1){
				exit = false;
			}
			if (exitOption == 2) {
				exit = true;
			}
		}
		}
    //The section below is the method to calculate Celsius to Fahrenheit.
	public static double celsiusToFahrenheit(){
		Scanner celsiusTemp = new Scanner(System.in);
		System.out.println("Input Celsius: ");
		double celsius = celsiusTemp.nextDouble();
		double fahrenheit = (((celsius * 9) / 5) + 32) ;;

		System.out.println(celsius + " Celsius is " + fahrenheit + " in Fahrenheit");

		return(fahrenheit);

	}
    	//The section below is the method to calculate Fahrenheit to Celsius.
	public static double fahrenheitToCelsius(){
		Scanner fahrenheitTemp = new Scanner(System.in);
		System.out.println("Input Fahrenheit: ");
		double fahrenheit1 = fahrenheitTemp.nextDouble();
		double celsius1 = (((fahrenheit1 - 32) * 5) / 9) ;

		System.out.println(fahrenheit1 + " Fahrenheit is " + celsius1 + " in Celsius");

		return(celsius1);
	}
	
	private static void hexToDecimal()
	  {
	      boolean exitHex = false;
	      //This while loop keeps the program running until the exit condition becomes true
	      while (!exitHex)
	      {
	           //This block defines key variables for the program
	           String hexNum = "";
	           int decNum = 0;
	           String digits = "0123456789ABCDEF";
	      
	           //This block of code asks the user for an input and assigns that input to the variable hexdec_num and sets all letters to upper case
	           Scanner scan = new Scanner(System.in);
	           System.out.println("Input a hexadecimal number: ");
	           hexNum = scan.nextLine();
	           hexNum = hexNum.toUpperCase();

	           //This for loop checks each character of the user input and compares them to the variable digits, and processes their postions in the user input to convert it into the output
	           for (int i = 0; i < hexNum.length(); i++)
	           {
	               char pos = hexNum.charAt(i);
	               int len = digits.indexOf(pos);
	               decNum = 16*decNum + len;
	           }

	           //This displays the converted output to the user
	           System.out.println("Equivalent decimal number is: " + decNum);
	           
	           //This is the exit module, asking the user if they wish to continue the program or exit to the main menu
	           Scanner exitScan = new Scanner(System.in);
	           System.out.println("Continue conversion? (1 = Yes; 2 = No)");
	           int exitCheck = 0;
	           boolean errorAlert;

	           // The section below validates the input to only acceept 1 or 2
	          do
	          {
	              if (exitScan.hasNextInt(1 | 2)) 
	              {
	                  exitCheck = exitScan.nextInt();
	                  errorAlert = true;
	              }
	              else
	              {
	                  System.out.println("Error! Enter 1 or 2");
	                  errorAlert = false;
	                  exitScan.next();
	              }

	          }while (!(errorAlert));
	       
	          if (exitCheck == 1)
	          {
	              exitHex = false;
	          }
	          if (exitCheck == 2) 
	          {
	              exitHex = true;
	          }
	      } //End of while loop
	      
	      System.out.println("Returning to main menu...\n.\n.\n.\n");
	    
	  }//End of hexadecimal to decimal code module
	
    private static void decimalToHex() {
   //this is the main section of the code.
	
    Display = 1;
	while (Display == 1) {
		System.out.println("conversion of decimal number to hexadecimal number");
		System.out.println("Enter the decimal number");
		
	    Scanner scan = new
	    Scanner(System.in);
	    int number=scan.nextInt();
		//A scanner is inputed as well as a string variable for storing data values.
        String hexadecimal="";
        while (number!=0) {
         
        	//this is the main process to convert decimal to hexadecimal (where the main calculations will  be occurring.
        	int remainder =number % 16;
           
        	switch (remainder) {
            case (10):hexadecimal='A'+hexadecimal;
            break;
            case (11):hexadecimal='B'+hexadecimal;
            break;
            case (12):hexadecimal='C'+hexadecimal;
            break;
            case (13):hexadecimal='D'+hexadecimal;
            break;
            case (14):hexadecimal='E'+hexadecimal;
            break;
            case (15):hexadecimal='F'+hexadecimal;
            break;
            default:hexadecimal=remainder+hexadecimal; }
           
            number =number / 16;   }
        //the final step in the calculation is the output of the value.
    	System.out.println("decimal number to hexadecimal converted");
    	// the calculator will finalise the process by outputting that the conversion has happened. 
        System.out.println("The hexadecimal number is "+hexadecimal);
        
		Scanner choice = new Scanner(System.in);
		System.out.println("To continue the program press (1), to leave, press (2) >>>");
		int userChoice = choice.nextInt();		
			switch (userChoice) {
				case 1:
					break;
				case 2:
					Display = 2;
					break;
					
        	}
    }
    }
	
    
    private static void advancedCalculator() {

        Scanner reader = new Scanner(System.in);

        char operator0;
        double result;
        double result1;
        double second;
        double first;
        int stay = 1;
        while (stay == 1)
        {
        
        	System.out.println("select funtion"); //Asks the user to choose a symbol ($, V, ^, %).
        	System.out.println("'$' = cube root ");
        	System.out.println("'V'= square root  ");
        	System.out.println("'^'= power  ");
        	System.out.println("'%' = modulo");

        	operator0=reader.next().charAt(0); //

        	System.out.print("Enter the first number: ");
        	first = reader.nextDouble();
        	switch (operator0) {
        	case 'V':
        		result = Math.sqrt(first); // square root of the first number
             	System.out.println(result);
             	break;

        	case '$':
        		result = Math.cbrt(first); // cube root of the first number
        		System.out.println(result);
        		break;

        		// nextDouble() reads the next double from the keyboard
        	case '^':
        		System.out.print("Enter the second number: "); 
        		second = reader.nextDouble();
        		result1 = Math.pow(first, second); //where "first" //is to the power of "second"
        		System.out.println(result1);
        		break;

        	case '%':
        		System.out.print("Enter the second number: "); 
        		second = reader.nextDouble();
        		result1 = first % second; //where "first" //is modulo by "second"
        		System.out.println(result1);
        		break; 
 
        		// operator doesn't match any case constant ($, V, ^, %)
        	default:
        		System.out.print("Error! operator is not correct");
            
        		return;
        	}

         
        	Scanner reader1 = new Scanner(System.in);
        	System.out.print("Do you want to end the program? (1)Yes/(2)No");
        	int inputDecision = reader1.nextInt();
        	switch (inputDecision) {
        	case 1:
        		stay = 0;
        		break;
        	case 2:
        		break;
        }        	        	
        }
    }


	// Syntax of java main method- entry point of any java program
	private static void binaryToDecimal()
	{

		// Declare variables
		boolean stayOption=true;
		// Decision loop run the program when condition is true
		while (stayOption==true)
		{
	
			// Scanner is used for obtaining input from user (initially binary number)
			Scanner userInput1=new Scanner(System.in);
	
			// Declare variables
			int binaryNumber=0; int temp;
			int decimalNumber=0, power=1;
	
			// Program asks user to input a valid binary number
			System.out.println("Binary to decimal convertor. Input a valid binary number:");
			// Scanner is used to detect that input 
			binaryNumber=userInput1.nextInt();
	
			// Main loop converting binary to decimal number 
			while (binaryNumber!=0)
			{
				/* Modulus operator with 10 is returns the reminder from division by 10
	 			temp variable is used to count the value of each binary number bit*/
				temp=binaryNumber%10;
				decimalNumber+=temp*power;
				power*=2;
				binaryNumber=binaryNumber/10;
			}
	
			// Program counts final value for decimal number and display it
			System.out.println("Decimal number:" + decimalNumber);

			// Scanner takes another input from user 
			Scanner stanOption=new Scanner(System.in);
			System.out.println("Do you want to return to the Main Menu?");
    
			// Decision loop- continue or return to the Main Menu
			String leaving=stanOption.nextLine();
			switch(leaving)
			{
			    // If user input "yes" program is returning to the Main Menu
				case "yes":
					System.out.println ("Returning to the Main Menu");
					stayOption=false;
					break;
				// If user input "no" program run binary to decimal conversion again
				case "no":
					break;
			}
    
    
    
		}  

	}

    
	//This is our main menu
	public static void main(String[] args) {
		//This while loop allows for the program to rerun after an individual section has been used.
		boolean program = true;
		while (program) {
		System.out.println("Welcome to the calculator");
		System.out.println("Here are your options (insert number please) \n 1) Standard Calculator \n 2) Advanced Calculator  \n 3) Temperature \n 4) Metric and Imperial Converter \n 5) Decimal to Binary \n 6) Binary to Decimal  \n 7) Decimal to Hex \n 8) Hex to Decimal \n 9) Exit ");
		//Scanner made for user to make a choice
		Scanner choice = new Scanner(System.in);
		System.out.println("Input your choice >>>");
		int userChoice = choice.nextInt();		
			switch (userChoice) {
			// This will be all the menu options
				case 1:
					standardCalculator();
					break;
				case 2:
					advancedCalculator();					
					break;
				case 3:
					temperature();					
					break;
				case 4:
					metricImperial();
					break;
				case 5:
					decimalBinary();
					break;
				case 6:
					binaryToDecimal();
					break;
				case 7:
					decimalToHex();
					break;
				case 8:
					hexToDecimal();
					break;
				case 9:
					program = false;
					break;
				default:
					System.out.print("Invalid Input");
					break;
					
			}
		}
	}
}



