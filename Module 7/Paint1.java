import java.util.Scanner;

public class Paint1 {

	/**
	* Method to get validated input that is a double that is greater than zero.
	* @param prompt 
	* @param input
	* @return validated input.
	*/
	private static double getInput(String prompt, Scanner input)
	{
		String readLine;
		double value = 0.0;
		do
		{
			System.out.println(prompt);
			readLine = input.nextLine();
			try 
			{
				value = Double.parseDouble(readLine);
			}
			catch (NumberFormatException e)
			{
				readLine = null;
			}
			
			if (value <= 0.0)
			{
				System.out.println("Invalid input.  Input must be a floating point value greater than zero!");
			}
		} while (value <= 0.0);
		
		return value;
	}


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
		
        final double squareFeetPerGallons = 350.0;
        
        wallHeight = getInput("Enter wall height (feet): ", scnr);
       	wallWidth  = getInput("Enter wall width (feet): ", scnr);
        
        System.out.println(String.valueOf(wallHeight) + ", " + String.valueOf(wallWidth));
        
        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
		System.out.println("Cans needed : " + Math.ceil(gallonsPaintNeeded) + " can(s)");

		// Close scnr object...
        scnr.close();
    }
}
