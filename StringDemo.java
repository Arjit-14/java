class StringDemo
{
    public static void main(String[] args)
    {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello " + str2;
        // str2 = "Bye";

        //string is inbuilt class and we create objects and call methods through it

        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(str3);

        System.out.println(str1.length());
        System.out.println(str2.charAt(4));
        // System.out.println(str2.charAt(5));

        if(str1.equals(str3))
        {
            System.out.println("Equal Strings");
        }
        else
        {
            System.out.println("Unequal Strings");
        }
    }
}