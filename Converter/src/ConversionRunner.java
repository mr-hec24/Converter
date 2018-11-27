
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
						DistanceConverter.distanceConversion();
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
	 
	  
	  System.out.println("Put in a value of this weight.");
	  Scanner userInput2 = new Scanner(System.in);
	  double startingValue = userInput2.nextDouble();
	  
	 
	  
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
		  
		  if(startingUnit.equals("kilogram")) {
			   if(endingUnit.equals("gram")) {
				   double endingValue1 = startingValue*1000;
				   System.out.println("The result is "+ endingValue1 + " grams");
			   }
			   if(endingUnit.equals("ton")) {
				   double endingValue2 = startingValue/1000;
				   System.out.println("The result is "+ endingValue2 + " tons");
			   }
			   if(endingUnit.equals("pound")) {
				   double endingValue3 = startingValue*2.20462;
				   System.out.println("The result is "+ endingValue3 + " pounds");
			   }
			   
			   if(endingUnit.equals("ounce")) {
				   double endingValue4 = startingValue*35.274;
				   System.out.println("The result is "+ endingValue4 + " ounces");
			   } 
			   if(sameUnit=true) {
				   System.out.println("The result is "+ startingValue + " kilograms");
			   }
			  
			  }
		  
		  
		  if(startingUnit.equals("gram")) {
			   if(endingUnit.equals("kilogram")) {
				   double endingValue5 = startingValue/1000;
				   System.out.println("The result is "+ endingValue5 + " grams");
			   }
			   if(endingUnit.equals("ton")) {
				   double endingValue6 = startingValue/1000000;
				   System.out.println("The result is "+ endingValue6 + " tons");
			   }
			   if(endingUnit.equals("pound")) {
				   double endingValue7 = startingValue/2.20462;
				   System.out.println("The result is "+ endingValue7 + " pounds");
			   }
			   
			   if(endingUnit.equals("ounce")) {
				   double endingValue8 = startingValue/35.274;
				   System.out.println("The result is "+ endingValue8 + " ounces");
			   }
			   if(sameUnit=true) {
				   System.out.println("The result is "+ startingValue + " grams");
			   }
			  }
		  
		  if(startingUnit.equals("ton")) {
			   if(endingUnit.equals("kilogram")) {
				   double endingValue5 = startingValue*1000;
				   System.out.println("The result is "+ endingValue5 + " kilograms");
			   }
			   if(endingUnit.equals("gram")) {
				   double endingValue6 = startingValue*1000000;
				   System.out.println("The result is "+ endingValue6 + " grams");
			   }
			   if(endingUnit.equals("pound")) {
				   double endingValue7 = startingValue*2000;
				   System.out.println("The result is "+ endingValue7 + " pounds");
			   }
			   
			   if(endingUnit.equals("ounce")) {
				   double endingValue8 = startingValue*32000;
				   System.out.println("The result is "+ endingValue8 + " ounces");
			   }
			   if(sameUnit=true) {
				   System.out.println("The result is "+ startingValue + " tons");
			   }
			  }
		  
		  if(startingUnit.equals("pound")) {
			   if(endingUnit.equals("kilogram")) {
				   double endingValue5 = startingValue*0.453592;
				   System.out.println("The result is "+ endingValue5 + " kilograms");
			   }
			   if(endingUnit.equals("gram")) {
				   double endingValue6 = startingValue*453.592;
				   System.out.println("The result is "+ endingValue6 + " grams");
			   }
			   if(endingUnit.equals("ton")) {
				   double endingValue7 = startingValue*0.0005;
				   System.out.println("The result is "+ endingValue7 + "tons");
			   }
			   
			   if(endingUnit.equals("ounce")) {
				   double endingValue8 = startingValue*16;
				   System.out.println("The result is "+ endingValue8 + " ounces");
			   }
			   if(sameUnit=true) {
				   System.out.println("The result is "+ startingValue + " pounds");
			   }
			  }
		  
		  if(startingUnit.equals("ounce")) {
			   if(endingUnit.equals("kilogram")) {
				   double endingValue5 = startingValue*0.0283495;
				   System.out.println("The result is "+ endingValue5 + " kilograms");
			   }
			   if(endingUnit.equals("gram")) {
				   double endingValue6 = startingValue*28.3495;
				   System.out.println("The result is "+ endingValue6 + " grams");
			   }
			   if(endingUnit.equals("ton")) {
				   double endingValue7 = startingValue*0.000031249974509375;
				   System.out.println("The result is "+ endingValue7 + "tons");
			   }
			   
			   if(endingUnit.equals("pound")) {
				   double endingValue8 = startingValue*0.062499949018750007579;
				   System.out.println("The result is "+ endingValue8 + " pounds");
			   }
			   if(sameUnit=true) {
				   System.out.println("The result is "+ startingValue + " ounces");
			   }
			   
			  }
	  }
	 
  }
	}
 


