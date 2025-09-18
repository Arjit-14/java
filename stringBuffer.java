public class stringBuffer 
{
    public static void main(String[] args)
    {

        //StringBuffer immutable(directly assigning) need to use its methods to change

        StringBuffer str = new StringBuffer("appolo ");
        str.append("hospital ");
        System.out.println(str);

        str.insert(16, "HSR Layout");
        System.out.println(str);

        // str = "bye";
        // System.out.println(str);

        str.replace(0, 6, "Fortis");
        System.out.println(str);

        str.delete(0, 1);
        System.out.println(str);

        str.insert(0, "F");
        System.out.println(str);

        str.reverse();
        System.out.println(str);

    }
}
