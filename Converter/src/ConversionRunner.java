import java.util.ArrayList;
import java.util.Scanner;
public class ConversionRunner
	{
		static Scanner userInput_int = new Scanner(System.in);
		static Scanner userInput_String = new Scanner(System.in);
		static Scanner userInput_double = new Scanner(System.in);
		public static void main(String[] args)
			{
				greetUser();
				int userChoice = pickConversionType();
				switch(userChoice)
				{
					case 1:
						temperatureConversion();
						break;
					case 2:
						weightConversion();
						break;
					case 3:
						break;
					case 4:
						timeConversion();
						break;
				}
			}
		public static void greetUser()
			{
				System.out.println("Hello, User! Welcome to the Universal Converter.");
				System.out.println("You can perform many kinds of conversions with this tool. Let's get started!");
			}
		public static int pickConversionType()
		{
			System.out.println("\nWhat kind of conversions would you like to do today?"
					+ "\n 1) Temperature"
					+ "\n 2) Weight"
					+ "\n 3) Distance"
					+ "\n 4) Time");
			int choice = userInput_int.nextInt();
			if(choice > 0 && choice < 5)
			{
				return choice;
			}
			return 0;
		}
  
  public static void timeConversion()
		{
			String[] timeUnits = {"Milliseconds", "Seconds", "Minutes", "Hours", "Days", "Weeks", "Years", "Decades", "Centuries"};
			boolean choosingStartingUnit = true;
			String startingUnit = "";
			while (choosingStartingUnit)
				{
					System.out.println("What's your unit of time you want to convert from?");
					for (String s: timeUnits)
						{
							System.out.println(s);
						}
					Scanner userInput = new Scanner (System.in);
					startingUnit = userInput.nextLine();
					for (String s: timeUnits)
						{
							if (startingUnit.toLowerCase().equals(s.toLowerCase()))
								choosingStartingUnit = false;
						}
				}
			
			boolean choosingEndingUnit = true;
			boolean sameUnit = false;
			while (choosingEndingUnit)
				{
					System.out.println("What's your unit of time you want to convert to?");
					for (String s: timeUnits)
						{
							System.out.println(s);
						}
					Scanner userInput = new Scanner (System.in);
					String endingUnit = userInput.nextLine();
					for (String s: timeUnits)
						{
							if (endingUnit.toLowerCase().equals(s.toLowerCase()))
								{
									if (endingUnit.toLowerCase().equals(startingUnit.toLowerCase()))
										sameUnit = true;
									
									else
										choosingStartingUnit = false;
								}
						}
				}
		}
  public static void temperatureConversion()
	  {
		  double tempFrom = 0;
		  double tempTo = 0;
		  String unitFrom = "";
		  String unitTo = "";
		  
		  System.out.println("What's the temperature you'd like to convert?");
		  tempFrom = userInput_double.nextDouble();
		  System.out.println("And what system of temperature is that?");
		  unitFrom = userInput_String.nextLine();
		  unitFrom.toLowerCase();
		  System.out.println("Lastly, what temperature system would you like to convert to?");
		  unitTo = userInput_String.nextLine();
		  unitTo.toLowerCase();
		  
	  }
  public static void weightConversion() {
	  String[] weightunits = {"kilogram", "gram", "ton", "pound","ounce"};
	  boolean choosingStartWeight = true;
	  String startingUnit = "";
	  while(choosingStartWeight) {
		  System.out.println("What's your unit of weight you want to convert from?");
		  for(String a: weightunits) {
			  System.out.println(a);
			
		  }
		  Scanner userInput = new Scanner(System.in);
		  startingUnit = userInput.nextLine();
		  for(String a : weightunits) {
			  if (startingUnit.toLowerCase().equals(a.toLowerCase()))
					choosingStartWeight = false;
		  }
		  
		  
	  }
	  boolean choosingEndWeight = true;
	  boolean sameUnit = false;
	  while(choosingEndWeight) {
		  System.out.println("What's your unit of weight you want to convert to?");
		  for(String a : weightunits) {
			  System.out.println(a);
		  }
		  Scanner userInput = new Scanner (System.in);
		  String endingUnit = userInput.nextLine();
		  for(String a : weightunits) {
			  if (endingUnit.toLowerCase().equals(a.toLowerCase()))
					{
						if (endingUnit.toLowerCase().equals(startingUnit.toLowerCase()))
							sameUnit = true;
						
						else
							choosingStartWeight = false;
					}
			 
		  }
	  }  
  
  }
	}
