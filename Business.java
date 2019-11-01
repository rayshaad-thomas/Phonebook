package phonebookproject;
/**
 * @author rayshaadthomas
 */
// This class is specifically for contacts that are people. Includes their zip
// code.
public class Business extends Contact
{
    // Since the class is for business contacts, we must add the zip code.
    private int zip; 
    // Constructor class that initializes all of the variables.
    public Business (String name, long phone, int zip)
    {
        super(name, phone);
        this.zip = zip;
    }
    // The method overrides the getInfo() method in the Contact class and adds 
    //  the zip code
    @Override
    public String getInfo()
    {
        return super.getInfo() + String.format("%-20d", zip);
    }
}
