import java.util.ArrayList;
import java.util.Scanner;
public class ConversionRunner
	{
		static Scanner userInput_int = new Scanner(System.in);
		public static void main(String[] args)
			{
				greetUser();
				int userChoice = pickConversionType();
				System.out.println(userChoice);
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
					+ "\n 2) Number Systems"
					+ "\n 3) Distance");
			int choice = userInput_int.nextInt();
			if(choice > 0 && choice < 4)
			{
				return choice;
			}
			return 0;
		}
	}
