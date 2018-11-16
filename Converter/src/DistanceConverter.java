import java.util.Scanner;

public class DistanceConverter
	{
		public static void distanceConversion()
  			{
  				System.out.println("What units of distance would you like to convert to?");
  				System.out.println("1) ft to m");
  				System.out.println("2) m to ft");
  				System.out.println("3) mi to km");
  				System.out.println("4) km to mi");
  				System.out.println("5) miles to ft");
  				System.out.println("6) ft to miles");
  				
  				Scanner userInput_int = new Scanner (System.in);
  				int choice = userInput_int.nextInt();
  				double footVal;
  				double meterVal;
  				double mileVal;
  				double kmVal;
  				if(choice == 1)
  					{
  						System.out.println("Enter in a value in feet to convert it to meters.");
  						footVal = userInput_int.nextInt();
  						meterVal = (footVal*0.3048);
  						System.out.println(footVal + " ft = " + meterVal + " m");
  					}
  				else if(choice == 2)
  					{
  						System.out.println("Enter in a value in meters to convert it to feet.");
  						meterVal = userInput_int.nextInt();
  						footVal = (meterVal*3.2808);
  						System.out.println(meterVal + " m = " + footVal + " ft"  );
  					}
  				else if(choice == 3)
  					{
  						System.out.println("Enter in a value in miles to convert it to kilometers.");
  						mileVal = userInput_int.nextInt();
  						kmVal = (mileVal * 1.609334);
  						System.out.println(mileVal + " mi = " + kmVal + " km");
  					}
  				else if(choice == 4)
  					{
  						System.out.println("Enter in a value in kilometers to convert it to miles.");
  						kmVal = userInput_int.nextInt();
  						mileVal = (kmVal * 0.62137);
  						System.out.println(kmVal + " km = " + mileVal + " mi");
  					}
  				else if(choice == 5)
  					{
  						System.out.println("Enter in a value in miles to convert it to feet.");
  						mileVal = userInput_int.nextInt();
  						footVal = (mileVal * 5280);
  						System.out.println(mileVal + " mi = " + footVal+ " ft");
  					}
  				else if(choice ==6)
  					{
  						System.out.println("Enter in a value in feet to convert it to miles.");
  						footVal = userInput_int.nextInt();
  						mileVal = (footVal * 0.00018939);
  						System.out.println(footVal + " ft = " + mileVal + " mi");
  					}
  			}
	}
