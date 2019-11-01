/*
 * Rayshaad Thomas
 * 892564854
 * Lab Section 1
 * Lab Assignment 5
 * Submission time: 6:36
 */
package phonebookproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rtho137
 */
public class Phonebook
{
    private ArrayList <Person> person = new ArrayList<>();
    private ArrayList <Business> business = new ArrayList<>();
    
    public Phonebook()
    {
        
    }
    
    public void addPerson(String name, long phone, String relationship)
    {
        Person newPerson = new Person(name, phone, relationship);
        person.add(newPerson);
    }
    
    public void addBusiness(String name, long phone, int zip)
    {
        Business newBusiness = new Business(name, phone, zip);
        business.add(newBusiness);
        
    }
    
    public void sortContacts()
    {
        Collections.sort(person);
        Collections.sort(business);
    }
    
    public void printContacts()
    {
        sortContacts();
        System.out.printf("%-20s %-20s %-20s\n","Person Name","Phone","Relationship");
        System.out.println("------------------------------------------------------");
        
        for (Contact personName : person)
        {
            System.out.println(personName.getInfo());
        }
        
        System.out.println("------------------------------------------------------");
        System.out.printf("%-20s %-20s %-20s\n","Business Name","Phone","Zip");
        System.out.println("------------------------------------------------------");
        
        for (Contact businessName : business)
        {
            System.out.println(businessName.getInfo());
        }
        
        System.out.println("------------------------------------------------------");
    }
    
    
}
