import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog>    dogList    = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    

    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        
        Scanner input       = new Scanner(System.in);
        boolean readyToQuit = false;
        
        while (!readyToQuit)
        {
            displayMenu();
            String userInput = input.nextLine();
            if (userInput.equals("q") || userInput.equals("Q"))
            {
                readyToQuit = true;
                continue;
            }
            int userChoice;
            try
            {
                userChoice = Integer.parseInt(userInput);
            }
            catch (NumberFormatException e)
            {
                continue;
            }
            switch (userChoice)
            {
                case 1 :
                    intakeNewDog(input);
                    break;
                case 2 :
                    intakeNewMonkey(input);
                    break;
                case 3 :
                    reserveAnimal(input);
                    break;
                case 4 :
                    printAnimals("dogs");
                    break;
                case 5 : 
                    printAnimals("monkeys");
                    break;
                case 6 :
                    printAnimals("reserved");
                    break;
            }
        }
        
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {

    }
    
    // Some mthods to gather the different information required to intake
    //   all rescue animals.
    
    // Method for getting gender.
    public static String gatherGender(String name, Scanner input)
    {
        String gender;
        do
        {
            System.out.println("What is " + name + "'s gender? [male | female]");
            gender = input.nextLine();
            if (!gender.toLowerCase().equals("male") || !gender.toLowerCase().equals("femal"))
                System.out.println("Invalid input.  Valid inputs are male | female");
        } while (!gender.toLowerCase().equals("male") || !gender.toLowerCase().equals("femal"));
        return gender;
    }
    
    // Method for getting age.
    public static String gatherAge(String name, Scanner input)
    {
        String age;
        do
        {
            System.out.println("How old is " + name + "in years? [integer]");
            age = input.nextLine();
            try
            {
                int ageVerification = Integer.parseInt(age);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input.  Valid inputs are digits.");
                age = null;
            }
        } while (age != null);
        return age;
    }
    
    // Method for getting weight.
    public static String gatherWeight(String name, Scanner input)
    {
        String weight;
        do
        {
            System.out.println("Enter " + name + "'s weight: [float]");
            weight = input.nextLine();
            try
            {
                double weightVerification = Float.parseFloat(weight);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input.  Valid inputs are a floating point number.");
                weight = null;
            }
        } while (weight != null);
        return weight;
    }
    
    // Method for getting acquisition date.
    public static String gatherDate(String name, Scanner input)
    {
        String acquisitionDate;
        do
        {
            System.out.println("Enter date of " + name + "'s aquisition: [MM-DD-YYYY]");
            acquisitionDate = input.nextLine();
            String[] dateVerification = acquisitionDate.split("-");
            int monthVerification = 0;
            int dayVerification = 0;
            int yearVerification = 0;
            if (dateVerification.length != 3)
            {
                System.out.println("Invalid input.  Valid input in format MM-DD-YYYY");
                acquisitionDate = null;
            }
            else
            {
                try
                {
                    monthVerification = Integer.parseInt(dateVerification[0]);
                    dayVerification   = Integer.parseInt(dateVerification[1]);
                    yearVerification  = Integer.parseInt(dateVerification[2]);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Invalid input.  Valid input in format MM-DD-YYYY");
                    acquisitionDate = null;
                }
                if ((monthVerification < 1) || (monthVerification > 12))
                {
                    System.out.println("Invalid month.  Valid months are between 1 and 12.");
                    acquisitionDate = null;
                }
                switch (monthVerification)
                {
                    case 2 :
                        if ( ( (yearVerification % 4 == 0) &&
                             (yearVerification % 100 != 0) || (yearVerification % 400 == 0) ) )
                        {
                            if ( (dayVerification < 1) || (dayVerification > 29) )
                            {
                                System.out.println("Invalid day.  Valid days are between 1 and 29.");
                                acquisitionDate = null;
                            }
                        }
                        else
                        {
                            if ( (dayVerification < 1) || (dayVerification > 28) )
                            {
                                System.out.println("Invalid day.  Valid days are between 1 and 28.");
                                acquisitionDate = null;
                            }
                        }
                        break;
                    case 4 :
                    case 6 :
                    case 9 :
                    case 11 :
                        if ( (dayVerification < 1) || (dayVerification > 30) )
                        {
                            System.out.println("Invalid day.  Valid days are between 1 and 30.");
                            acquisitionDate = null;
                        }
                        break;
                    default :
                        if ( (dayVerification < 1) || (dayVerification > 31) )
                        {
                            System.out.println("Invalid day.  Valid days are between 1 and 31.");
                            acquisitionDate = null;
                        }
                }
            }
        } while (acquisitionDate != null);
        return acquisitionDate;
    }
    
    // Method for getting acquisition country.
    private static String gatherCountry(String name, Scanner input)
    {
        String acquisitionCountry;
        do
        {
            System.out.println("Enter " + name + "'s Country of acquisition:");
            acquisitionCountry = input.nextLine();
        } while (acquisitionCountry != null);
        return acquisitionCountry;
    }

    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        // Modified to validate that the name entered is not null.
        String name;
        do
        {
            System.out.println("What is the dog's name?");
            name = scanner.nextLine();
        } while (name != null);
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        System.out.println("Enter " + name + "'s breed:");
        String breed = scanner.nextLine();
        String gender = gatherGender(name, scanner);
        String age = gatherAge(name, scanner);
        String weight = gatherWeight(name, scanner);
        String acquisitionDate = gatherDate(name, scanner);
        String acquisitionCountry = gatherCountry(name, scanner);
        
        Dog intakeDog = new Dog(name, breed, gender, age, weight, acquisitionDate, 
                                 acquisitionCountry, "intake", false, "None");
        dogList.add(intakeDog);
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            String name;
            do
            {
                System.out.println("What is the monkey's name?");
                name = scanner.nextLine();
                if (name == null)
                    System.out.println("Invalid input.  Please enter a valid name.");
            } while (name != null);
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return; //returns to menu
                }
            }
            
            String species;
            boolean validSpecies = false;
            do
            {
                System.out.println("Enter " + name + "'s species:");
                System.out.println("Valid species are:");
                System.out.println("  Capuchin");
                System.out.println("  Guenon");
                System.out.println("  Macaque");
                System.out.println("  Marmoset");
                System.out.println("  Squirrel monkey");
                System.out.println("  Tamarin");
                species = scanner.nextLine();
                
                if ((species.toLowerCase().equals("capuchin"))        || 
                    (species.toLowerCase().equals("guenon"))          ||
                    (species.toLowerCase().equals("macaque"))         ||
                    (species.toLowerCase().equals("marmoset"))        ||
                    (species.toLowerCase().equals("squirrel monkey")) ||
                    (species.toLowerCase().equals("tamarin")))
                {
                    validSpecies = true;
                }
                if (!validSpecies)
                    System.out.println("Invalid input.  Please enter a valid species.");
            } while (!validSpecies);
            
            int height = 0;
            String heightString;
            do
            {
                System.out.println("What is " + name + "'s height?");
                heightString = scanner.nextLine();
                try
                {
                    height = Integer.parseInt(heightString);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Invalid input.  Valid input is an integer greater than 0.");
                    heightString = null;
                }
            } while (heightString != null);
            
            int bodyLength = 0;
            String bodyLengthString;
            do
            {
                System.out.println("What is " + name + "'s body length?");
                bodyLengthString = scanner.nextLine();
                try
                {
                    bodyLength = Integer.parseInt(bodyLengthString);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Invalid input.  Valid input is an integer greater than 0.");
                    bodyLengthString = null;
                }
            } while (bodyLengthString != null);
            
            int tailLength = 0;
            String tailLengthString;
            do
            {
                System.out.println("What is " + name + "'s tail length?");
                tailLengthString = scanner.nextLine();
                try
                {
                    tailLength = Integer.parseInt(tailLengthString);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Invalid input.  Valid input is an integer greater than 0.");
                    tailLengthString = null;
                }
            } while (heightString != null);
                        
            String gender = gatherGender(name, scanner);
            String age = gatherAge(name, scanner);
            String weight = gatherWeight(name, scanner);
            String acquisitionDate = gatherDate(name, scanner);
            String acquisitionCountry = gatherCountry(name, scanner);
            
            Monkey intakeMonkey = new Monkey(name, species, gender, age, 
                                             weight, acquisitionDate, acquisitionCountry, 
                                             "intake", false, "None", height, 
                                             bodyLength, tailLength);
            monkeyList.add(intakeMonkey);
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String reportType) {
            System.out.println("The method printAnimals needs to be implemented");

        }
        

}

