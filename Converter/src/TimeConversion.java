import java.util.Scanner;

public class TimeConversion
	{
		static String[] timeUnits = {"Milliseconds", "Seconds", "Minutes", "Hours", "Days", "Weeks", "Years", "Decades", "Centuries"};
		static int startingUnit;
		static double startingUnitNumber;
		static int endingUnit;
		static Scanner userInput_Int;
		static boolean choosingUnit;
		
		public static void timeConverter()
		{
			//All smaller methods are going to be in here
			askForStartingUnit();
			askForEndingUnit();
		}
		
		public static void askForStartingUnit()
		{
			startingUnit = 0;
			choosingUnit = true;
			while (choosingUnit)
				{
					System.out.println("Please Choose Your Beginning Unit Of Time");
					int i = 1;
					for (String s: timeUnits)
						{
							System.out.println("[" + i + "] " + s);
							i++;
						}
					
					userInput_Int = new Scanner (System.in);
					startingUnit = userInput_Int.nextInt();
					if (startingUnit > 9 || startingUnit < 1)
						{
							System.out.println("\nPlease Try Another Number"
									+ "\n ");
						}
						
					
					else
						choosingUnit = false;
				}
			
			
			System.out.println("How Many " + assignValues(startingUnit) + " Would You Like To Convert?");
			startingUnitNumber = userInput_Int.nextDouble();
		}
		
		public static void askForEndingUnit()
		{
			endingUnit = 0;
			choosingUnit = true;
			while (choosingUnit)
				{
					System.out.println("Please Choose Your Beginning Unit Of Time");
					int i = 1;
					for (String s: timeUnits)
						{
							System.out.println("[" + i + "] " + s);
							i++;
						}
					
					userInput_Int = new Scanner (System.in);
					endingUnit = userInput_Int.nextInt();
					if (endingUnit > 9 || endingUnit < 1 || endingUnit == startingUnit)
						{
							System.out.println("\nPlease Try Another Number"
									+ "\n ");
						}
					
					else
						choosingUnit = false;
				}
		}
		
		public static String assignValues(int choice)
		{
			switch (choice)
			{
				case 1:
						{
							return "Milliseconds";
						}
				case 2:
						{
							return "Seconds";
						}
				case 3:
						{
							return "Minutes";
						}
				case 4:
						{
							return "Hours";
						}
				case 5:
						{
							return "Days";
						}
				case 6:
						{
							return "Weeks";
						}
				case 7:
						{
							return "Years";
						}
				case 8:
						{
							return "Decades";
						}
				case 9:
						{
							return "Centuries";
						}
				default:
						{
							return "NOT AVAILABLE";
						}
			}
		}
	
		public static int conversion()
		{
			int endResult = 0;
			if (startingUnit > endingUnit)
				{
					//MULTIPLY
				}
			else
				{
					//DIVIDE
				}
			
			return endResult;
		}
		
	}
