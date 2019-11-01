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
public class Business extends Contact 
{
    private int zip;
    
    public Business(String name, long phone, int zip) 
    {
        super(name, phone);
        this.zip = zip;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getInfo()
    {
        return super.getInfo() + String.format("%-20d", zip);
    }
}
