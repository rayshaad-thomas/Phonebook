package phonebookproject;
/**
 * @author rayshaadthomas
 */
public class Person extends Contact
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
