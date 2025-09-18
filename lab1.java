class Menu
{
    String name, category;
    double price;

    Menu()
    {

    }

    Menu(String nm, String cg, double pr)
    {
        name = nm;
        category = cg;
        price = pr;
    }

    void setMenu(String nm, String cg, double pr)
    {
        name = nm;
        category = cg;
        price = pr;
    }

    void showMenuItem()
    {
        System.out.println("Name is : "+name);
        System.out.println("Category is : "+category);
        System.out.println("Price is : "+price);
        System.out.println();
    }
}

class Order 
{
    int orderNo, qty;
    String name;
    double price, bill;

    Order()
    {

    }

    Order(int orNo, int qt, String nm, double pr)
    {
        orderNo = orNo;
        qty = qt;
        name = nm;
        price = pr;
        bill = qty * price;
    }

    void setOrder(int orNo, int qt, String nm, double pr)
    {
        orderNo = orNo;
        qty = qt;
        name = nm;
        price = pr;
        bill = qty * price;
    }

    void getOrder()
    {
        System.out.println("Order Number is: "+orderNo);
        System.out.println("Food Ordered is: "+name);
        System.out.println("Quantity Ordered is: "+qty);
        System.out.println("Total Price is: "+price);
        System.out.println("Total bill paid: "+bill);
        System.out.println();
    }
}


public class lab1 {
    public static void main(String[] args)
    {
        Menu ob = new Menu();
        System.out.println("----Default Constructor----");
        ob.showMenuItem();

        Menu ob1 = new Menu("Pav Bhaji", "Breakfast", 270.00);
        System.out.println("----Parameterised Constructor----");
        ob1.showMenuItem();

        ob.setMenu("Dosa", "Dinner", 40.00);
        ob.showMenuItem();

        Order ob2 = new Order();
        System.out.println("----Default Constructor----");
        ob2.getOrder();

        Order ob3 = new Order(101, 2, "Maggie", 50.00);
        System.out.println("----Parameterised Constructor----");
        ob3.getOrder();

        ob2.setOrder(102, 3, "Chole Bhature", 100.00);
        ob2.getOrder();

    }
}
