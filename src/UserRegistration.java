public class UserRegistration
{
    static class InvalidCountryException extends Exception
    {
        public String toString()
        {
            return "InvalidCountryException";
        }
    }
    public void registeruser(String username,String usercountry)
    {
        try
        {
            if(usercountry.equals("India")==false)
            {
                throw new InvalidCountryException();
            }
            System.out.println("User Registration done successfully");
        }
        catch(InvalidCountryException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        UserRegistration obj=new UserRegistration();
        obj.registeruser("raghav","usa");
        obj.registeruser("raghav","India");
    }
}
