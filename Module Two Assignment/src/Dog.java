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
 **   05 July 2021   P.D. Pattison     Initial Coding...                      **
 **   06 July 2021   P.D. Pattison     Imported into IntelliJ IDE             **
 **                                                                           **
 *******************************************************************************
 ******************************************************************************/


//  Class declaration and implementation
public class Dog extends Pet
{
    
    //  private class fields...
    private int dogWeight;
    private int dogSpaceNumber;
    private boolean grooming;
    
    //  class constructors...
    public Dog()
    {
        this(0, 0, false);
    }
    
    public Dog(int new_space, int new_weight, boolean new_grooming)
    {
        this.dogSpaceNumber = new_space;
        this.dogWeight = new_weight;
        this.grooming = new_grooming;
    }
    
    //  public getters and setters...
    //  get and set for dogSpaceNumber field.
    public void setDogSpaceNumber(int new_space_number)
    {
        this.dogSpaceNumber = new_space_number;
    }
    
    public int getDogSpaceNumber()
    {
        return this.dogSpaceNumber;
    }
    
    //  get and set methods for dogWeight field.
    public void setDogWeight(int new_dog_weight)
    {
        this.dogWeight = new_dog_weight;
    }
    
    public int getDogWeight()
    {
        return this.dogWeight;
    }
    
    //  get and set methods for grooming field.
    public void setGrooming(boolean new_grooming)
    {
        this.grooming = new_grooming;
    }
    
    public boolean getGrooming()
    {
        return this.grooming;
    }
    
    
}