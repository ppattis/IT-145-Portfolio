import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Loop to get input for wall height, and validate that input is 
		//  a valid number that is greater than 0.0
        do
        {
        	System.out.println("Enter wall height (feet): ");
        	String stringWallHeight = scnr.nextLine();
        	
        	try
        	{
        		wallHeight = Double.parseDouble(stringWallHeight);
        	}
        	catch (NumberFormatException e)
        	{
        		stringWallHeight = null;
        	}
        	
        	if (wallHeight <= 0.0)
        	{
        		System.out.println("Invalid input.  Input must be a floating point value greater than zero!");
        	}
        } while (wallHeight <= 0.0);

        // Loop to get input for wall width, and validate that input is 
		//  a valid number that is greater than 0.0
        do
        {
        	System.out.println("Enter wall width (feet): ");
        	String stringWallWidth = scnr.nextLine();
        	
        	try
        	{
        		wallWidth = Double.parseDouble(stringWallWidth);
        	}
        	catch (NumberFormatException e)
        	{
        		stringWallWidth = null;
        	}
        	
        	if (wallWidth <= 0.0)
        	{
        		System.out.println("Invalid input.  Input must be a floating point value greater than zero!");
        	}
        } while (wallWidth <= 0.0);

        
        System.out.println(String.valueOf(wallHeight) + ", " + String.valueOf(wallWidth));
        
        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

		// Close scnr object...
        scnr.close();
    }
}
