class bill
{
    private int pin;
    public double amount;
    int receipt;

    private void pin()
    {
        pin = 123;
        System.out.println("Pin is: "+pin);
    }

    public void setAmount(double amt, int recpt)
    {
        amount = amt;
        receipt = recpt;
    }

    void getAmount()
    {
        System.out.println("Amount is"+amount);
        System.out.println("Receipt is "+receipt);
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
        bill ob = new bill();
        ob.setAmount(0, 0);
    }
}
