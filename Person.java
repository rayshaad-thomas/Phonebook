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
public class Person extends Contact implements compareTo <Person>
{
    public String relationship;
    
    public Person(String name, long phone, String relationship) 
    {
        super(name, phone);
        this.relationship = relationship;
    }
    
    @Override
    public String getInfo()
    {
        return super.getInfo() + String.format("%-20s", relationship);
    }
}
