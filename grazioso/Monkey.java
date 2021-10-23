/******************************************************************************
 *******************************************************************************
 **                                                                           **
 **   Patrick D. Pattison                                                     **
 **   IT-145-J6237 - Module Two Assignment                                    **
 **   Southern New Hampshire University                                       **
 **                                                                           **
 **   Class Name   :  Monkey                                                  **
 **   Description  :  Declaration and Implementation of the Monkey Class.     **
 **                                                                           **
 **   Revision History                                                        **
 **                                                                           **
 **     Date           Programmer        Description                          **
 **   27 July 2021   P.D. Pattison     Initial coding...                      **
 **                                                                           **
 *******************************************************************************
 ******************************************************************************/

/**
 *
 * @author P.D. Pattison
 */
public class Monkey extends RescueAnimal
{
    //  Class fields.
    private String species;
    private int    height;
    private int    bodyLength;
    private int    tailLength;
    
    /**
     * Monkey class constructor.
     * @param name
     * @param species
     * @param gender
     * @param age
     * @param weight
     * @param acquisitionDate
     * @param acquisitionCountry
     * @param trainingStatus
     * @param reserved
     * @param inServiceCountry
     * @param height
     * @param bodyLength
     * @param tailLength 
     */
    Monkey(String name, String species, String gender, String age, 
           String weight, String acquisitionDate, String acquisitionCountry, 
           String trainingStatus, boolean reserved, String inServiceCountry,
           int height, int bodyLength, int tailLength)
    {
        setAnimalType("Monkey");
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        this.species    = species;
        this.height     = height;
        this.bodyLength = bodyLength;
        this.tailLength = tailLength;
    }
    
    /**
     * Method to get species.
     * @return Species
     */
    public String getSpecies()
    {
        return this.species;
    }
    
    /**
     * Method to set species.
     * @param species 
     */
    public void setSpecies(String species)
    {
        this.species = species;
    }
    
    /**
     * Method to get height.
     * @return height
     */
    public int getHeight()
    {
        return this.height;
    }
    
    /**
     * Method to set height.
     * @param height 
     */
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    /**
     * Method to get body length.
     * @return body length
     */
    public int getBodyLength()
    {
        return this.bodyLength;
    }
    
    /**
     * Method to set body length.
     * @param bodyLength 
     */
    public void setBodyLength(int bodyLength)
    {
        this.bodyLength = bodyLength;
    }
    
    /**
     * Method to get tail length.
     * @return tail length
     */
    public int getTailLength()
    {
        return this.tailLength;
    }
    
    /**
     * Method to set tail length.
     * @param tailLength 
     */
    public void setTailLength(int tailLength)
    {
        this.tailLength = tailLength;
    }
}
