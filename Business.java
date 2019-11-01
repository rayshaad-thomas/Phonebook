package phonebookproject;
/**
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
    @Override
    public String getInfo()
    {
        return super.getInfo() + String.format("%-20d", zip);
    }
}
