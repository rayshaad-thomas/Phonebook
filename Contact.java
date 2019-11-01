package phonebookproject;
/**
 * @author rayshaadthomas
 */
// This class is for the base of any contact in the phonebook (only the name and 
// phone number)
public class Contact implements Comparable <Contact>
{
    // Initializing the variables for a contact. Each contact will have at least
    // a name and phone number.
    private String name;
    private long phone;
    // Constructor class. Initializes the object of a class, in this case it is a
    // contact
    public Contact (String name, long phone)
    {
        // this._____ calls the private variable outside of the constructor, 
        // and sets it equal to the variables inside the constructor.
        this.name = name;
        this.phone = phone;
    }
    // The method returns the contact's info
    public String getInfo () 
    {
        return String.format("%-20s %-20d ", name, phone);
    }
    // The method compares the strings in alphabetical order
    @Override
    public int compareTo (Contact otherContact)
    {
        return name.compareTo(otherContact.name);
    }
}
