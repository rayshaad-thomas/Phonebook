package phonebookproject;
/**
 * @author rayshaadthomas
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
