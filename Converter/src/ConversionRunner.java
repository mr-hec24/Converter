import java.util.ArrayList;
import java.util.Scanner;
public class ConversionRunner
	{
		static Scanner userInput_int = new Scanner(System.in);
		public static void main(String[] args)
			{
				greetUser();
				pickConversionType();
			}
		public static void greetUser()
			{
				System.out.println("Hello, User! Welcome to the Universal Converter.");
				System.out.println("You can perform many kinds of conversions with this tool. Let's get started!");
			}
		public static void pickConversionType()
		{
			System.out.println("\nWhat kind of conversions would you like to do today?"
					+ "\n 1) Temperature"
					+ "\n 2) Number Systems"
					+ "\n 3) Distance"
					+ "\n 4) Time");
			int choice = userInput_int.nextInt();
			if(choice > 0 && choice < 5)
			{
				switch(choice)
				{
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						timeConversion();
						break;
				}
			}
		}
  
		//Hello
  public static void timeConversion()
		{
			String beginningUnit = chooseBeginningUnit();
			String endingUnit = chooseEndingUnit();
		}
	
  public static String chooseBeginningUnit()
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
		return startingUnit;
	  }
  
  public static String chooseEndingUnit(String startingUnit)
	  	{
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
		  return endingUnit;
	  	}
  
	}


