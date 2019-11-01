/*
 * Rayshaad Thomas
 * 892564854
 * Lab Section 1
 * Lab Assignment 5
 * Submission time: 6:36
 */
package phonebookproject;

/**
 *
 * @author rtho137
 */
public class Contact implements Comparable<Contact>
{
    public String name;
    public long phone;
    
    public Contact(String name, long phone)
        {
            this.name = name;
            this.phone = phone;
        }
    
    
    public String getInfo()
    {
        return String.format("%-20s %-20d", name, phone);
    }
    
    
    
    public int compareTo(Contact other)
    {
        return name.compareTo(other.name);
    }
    
}
