package phonebookproject;
import java.util.ArrayList;
import java.util.Collections;
/**
 * @author rayshaadthomas
 */
public class Phonebook 
{
    private ArrayList <Person> person = new ArrayList <> ();
    private ArrayList <Business> business = new ArrayList <> ();
    // blank constructor
    public Phonebook ()
    {
        
    }
    // The method adds a new Person element to the person array.
    public void addPerson (String name, long phone, String relationship) 
    {
        Person newPerson = new Person(name, phone, relationship);
        person.add(newPerson);
    }
    // The method adds a new Business element to the business array.
    public void addBusiness (String name, long phone, int zip) 
    {
        Business newBusiness = new Business(name, phone, zip);
        business.add(newBusiness);
    }
     public void addBusiness (Business business1) 
     {
         business.add(business1);
     }
    // The method sorts both the person and business array.
    public void sortContacts () 
    {
        Collections.sort(person);
        Collections.sort(business);
    }
    public void printContacts () 
    {
        sortContacts();
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-20s %-20s %-20s\n", "Name", "Phone", "Relationship");
        System.out.println("-------------------------------------------------------\n");
        // The loop searches for Contacts in the person array.
        for (Contact personName : person)
        {
            System.out.println(personName.getInfo());
        }
        System.out.println("\n------------------------------------------------------"); 
        System.out.printf("%-20s %-20s %-20s\n", "Name", "Phone", "Zip");
        System.out.println("------------------------------------------------------\n");
        // The loop searches for Contacts in the business array.
        for (Contact businessName : business) 
        {
            System.out.println(businessName.getInfo());
        }          
    }
}
