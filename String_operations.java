class StringOperations
{
    public static void main (String args[])
    {
        String firstname = "Sachin";
        String middlename = "Ramesh";
        String lastname = "Tendulkar";
        String name = firstname.concat(middlename).
                      concat(lastname);
        System.out.println("Name is : " + name);
        System.out.println("length of name is " + 
                           name.length());
        System.out.println("substring of name is : " + name.substring(7, 13));
    }
}
