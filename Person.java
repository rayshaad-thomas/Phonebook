package phonebookproject;
/**
 * @author rayshaadthomas
 */
// This class is specifically for contacts that are people. Includes their
// relationship.
public class Person extends Contact
{
    // Since the class is for personal contacts, we must add the relationship.
    private String relationship;
    // Constructor class that initializes all of the variables.
    public Person (String name, long phone, String relationship) 
    {
        super(name, phone);
        this.relationship = relationship;
    }
    // The method overrides the getInfo() method in the Contact class and adds the
    // relationship.
    @Override
    public String getInfo()
    {
        return super.getInfo() + String.format("%-20s", relationship);
    }
}
