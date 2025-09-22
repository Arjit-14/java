class bill
{
    private int pin;
    public double amount;
    int receipt;

    private void pin()
    {
        pin = 123;
        System.out.println(pin);
    }

    public void setAmount(double amt, int recpt)
    {
        amount = amt;
        receipt = recpt;
    }

    void getAmount()
    {
        System.out.println(amount);
        System.out.println(receipt);
    }

    void displayPin()
    {
        pin();
    }
}




public class fifth 
{
    public static void main(String[] args)
    {

    }
}
