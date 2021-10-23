/******************************************************************************
 *******************************************************************************
 **                                                                           **
 **   Patrick D. Pattison                                                     **
 **   IT-145-J6237 - Module Two Assignment                                    **
 **   Southern New Hampshire University                                       **
 **                                                                           **
 **   Class Name   :  Dog                                                     **
 **   Description  :  Declaration and Implementation of the Dog Class.        **
 **                                                                           **
 **   Revision History                                                        **
 **                                                                           **
 **     Date           Programmer        Description                          **
 **   06 July 2021   P.D. Pattison     Initial coding...                      **
 **   21 July 2021   P.D. Pattison     Reformated code to better adhere to    **
 **                                    the required coding standard.          **
 **                                                                           **
 *******************************************************************************
 ******************************************************************************/

//  Class declaration and implementation
public class Pet
{
	//  Static Constants for petType.
	public static final int NO_TYPE  = 0;
	public static final int DOG_TYPE = 1;
	public static final int CAT_TYPE = 2;
	
	//  Class fields...
    private int    petType;
    private String petName;
    private int    petAge;
    private int    dogSpaces = 30;
    private int    catSpaces = 12;
    private int    daysStay;
    private double amountDue;
    
    //  class default constructor...
    public Pet()
    {
		this.petType   = Pet.NO_TYPE;
		this.petName   = null;
		this.petAge    = 0;
		this.daysStay  = 0;
		this.amountDue = 0.00;
    }
	
	//  class custom constructor...
	public Pet(int petType, String petName, int petAge, int daysStay)
	{
		this.petType   = petType;
		this.petName   = petName;
		this.petAge    = petAge;
		this.daysStay  = daysStay;
		this.amountDue = 0.00;
	}
    
    //  public getters and setters...
    //  get and set for petType field.
    public void setPetType(int newType)
    {
        this.petType = newType;
    }
    
    public int getPetType()
    {
        return this.petType;
    }
    
    // get and set for petName field.
    public void setPetName(String newName)
    {
        this.petName = newName;
    }
    
    public String getPetName()
    {
        return this.petName;
    }
    
    // get and set for petAge field.
    public void setPetAge(int newAge)
    {
        this.petAge = newAge;
    }
    
    public int getPetAge()
    {
        return this.petAge;
    }
    
    // get and set for dogSpaces field.
    public void setDogSpaces(int newSpaces)
    {
        this.dogSpaces = newSpaces;
    }
    
    public int getDogSpaces()
    {
        return this.dogSpaces;
    }
    
    //  get and set for catSpaces field.
    public void setCatSpaces(int newSpaces)
    {
        this.catSpaces = newSpaces;
    }
    
    public int getCatSpaces()
    {
        return this.catSpaces;
    }
    
    //  get and set for daysStay field.
    public void setDaysStay(int newDays)
    {
        this.daysStay = newDays;
    }
    
    public int getDaysStay()
    {
        return this.daysStay;
    }
    
    //  get and set for amountDue field.
    public void setAmountDue(double newAmount)
    {
        this.amountDue = newAmount;
    }
    
    public double getAmountDue()
    {
        return this.amountDue;
    }
    
}
