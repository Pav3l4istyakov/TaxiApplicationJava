public class Driver {
    private String Name;
    private int id;
    private String PhoneNumber;
    private DriverStatus driver;

    public Driver(int id, String name, String phoneNumber)
    {
        this.id = id;
        this.Name = name;
        this.PhoneNumber  = PhoneNumber;
    }
    public int getId() {
        return id;
    }
    public void setId(String name)
    {
        this.Name = name;
    }
    public String getName() {
        return Name;
    }
    public void SetName(String name)
    {
        this.Name = name;
    }

    public String getPhoneNumber()
    {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.PhoneNumber = phoneNumber;
    }



}
