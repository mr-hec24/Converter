import java.util.Scanner;

public class TimeConversion
	{
		static String[] timeUnits = {"Milliseconds", "Seconds", "Minutes", "Hours", "Days", "Weeks", "Months", "Years", "Decades", "Centuries"};
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
			System.out.println(startingUnitNumber + " " + assignValues(startingUnit) + " is equivalent to " + conversion() + " " + assignValues(endingUnit) + " ");
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
							System.out.println(" " + i + ") " + s);
							i++;
						}
					
					userInput_Int = new Scanner (System.in);
					startingUnit = userInput_Int.nextInt();
					if (startingUnit > 10 || startingUnit < 1)
						{
							System.out.println("\nPlease Try Another Number"
									+ "\n ");
						}
						
					
					else
						choosingUnit = false;
				}
			
			
			System.out.println("How Many " + assignValues(startingUnit) + " Would You Like To Convert? (Decimals are allowed)");
			startingUnitNumber = userInput_Int.nextDouble();
		}
		
		public static void askForEndingUnit()
		{
			endingUnit = 0;
			choosingUnit = true;
			while (choosingUnit)
				{
					System.out.println("Please Choose Your Ending Unit Of Time");
					int i = 1;
					for (String s: timeUnits)
						{
							System.out.println(" " + i + ") " + s);
							i++;
						}
					
					userInput_Int = new Scanner (System.in);
					endingUnit = userInput_Int.nextInt();
					if (endingUnit > 10 || endingUnit < 1 || endingUnit == startingUnit)
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
							return "Months";
						}
				case 8:
						{
							return "Years";
						}
				case 9:
						{
							return "Decades";
						}
				case 10:
						{
							return "Centuries";
						}
				default:
						{
							return "NOT AVAILABLE";
						}
			}
		}
	
		public static double convertBiggerToSmaller(int beg, int end, double unit)
		{
			if (end < beg)
				{
					switch (beg)
					{
						case 1:
								{
									unit *= 1000;
									break;
								}
						case 2:
						case 3:
								{
									unit *= 60;
									break;
								}
						case 4:
								{
									unit *= 24;
									break;
								}
						case 5:
								{
									unit *= 7;
									break;
								}
						case 6:
								{
									unit *= 4.3452380952381;
									break;
								}
						case 7:
								{
									unit *= 12;
									break;
								}
						case 8:
						case 9:
						case 10:
								{
									unit *= 10;
									break;
								}
					}
					int newBeg = beg - 1;
					return convertBiggerToSmaller(newBeg, end, unit);
				}
			else
				return unit;
			
		}
		
		public static double convertSmallerToBigger(int beg, int end, double unit)
			{
				if (beg < end)
					{
						switch (beg)
						{
							case 1:
									{
										unit /= 1000;
										break;
									}
							case 2:
							case 3:
									{
										unit /= 60;
										break;
									}
							case 4:
									{
										unit /= 24;
										break;
									}
							case 5:
									{
										unit /= 7;
										break;
									}
							case 6:
									{
										unit /= 4.348115;
										break;
									}
							case 7:
									{
										unit /= 12.000008;
										break;
									}
							case 8:
							case 9:
							case 10:
									{
										unit /= 10;
										break;
									}
						}
						int newBeg = beg + 1;
						return convertSmallerToBigger(newBeg, end, unit);
					}
				else
					return unit;
			}
		
		public static double conversion()
		{
			String[] converting = {"C", "O", "N", "V", "E", "R", "T", "I", "N", "G"};
			for (int i = 0; i < 10; i++)
				{
					System.out.print(converting[i] + " ");
					try
						{
							Thread.sleep(750);
						} catch (InterruptedException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			
			System.out.println("\n ");
			
			double endResult = 0;
			if (startingUnit > endingUnit)
				{
					endResult = convertBiggerToSmaller(startingUnit, endingUnit, startingUnitNumber);
					
				}
			else
				{
					endResult = convertSmallerToBigger(startingUnit, endingUnit, startingUnitNumber);
				}
			
			return endResult;
		}
		
	}
