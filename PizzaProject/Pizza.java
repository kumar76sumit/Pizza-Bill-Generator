package PizzaProject;

public class Pizza {
    
    private boolean isVeg;
    private int extraCheesePrice;
    private boolean isExtraCheeseAdded;
    private int extraToppingsPrice;
    private boolean isExtraToppingsAdded;
    private int paperBagPrice;
    private boolean isPaperBagAdded;
    private int totalPrice;
    protected String bill;

    Pizza(boolean isVeg)
    {
        if(isVeg)
        {
            totalPrice=300;
            extraToppingsPrice=70;
            bill="Base Price Of The Pizza : " + totalPrice + "\n";
        }
        else
        {
            totalPrice=400;
            extraToppingsPrice=120;
            bill="Base Price Of The Pizza : " + totalPrice + "\n";
        }
        extraCheesePrice=80;
        paperBagPrice=20;
    }

    public void addExtraCheese()
    {
        isExtraCheeseAdded=true;
        totalPrice=totalPrice+extraCheesePrice;
        bill=bill+"Extra Cheese Added : " + extraCheesePrice + "\n";
    }
    public void removeExtraCheese()
    {
        if(isExtraCheeseAdded!=true)
        {
            System.out.println("Sorry! You haven't added Extra Cheese.");
            System.out.println("--------------------------------------");
        }
        else
        {
            totalPrice=totalPrice-extraCheesePrice;
            bill=bill+"Extra Cheese Removed : -" + extraCheesePrice + "\n";
        }
    }
    public void addExtraToppings()
    {
        isExtraToppingsAdded=true;
        totalPrice=totalPrice+extraToppingsPrice;
        bill=bill+"Extra Toppings Added : " + extraToppingsPrice + "\n";
    }
    public void removeExtraToppings()
    {
        if(isExtraToppingsAdded!=true)
        {
            System.out.println("Sorry! You haven't added Extra Toppings.");
            System.out.println("----------------------------------------");
        }
        else
        {
            totalPrice=totalPrice-extraToppingsPrice;
            bill=bill+"Extra Cheese Removed : -" + extraToppingsPrice + "\n";
        }
    }
    public void addPaperBag()
    {
        isPaperBagAdded=true;
        totalPrice=totalPrice+paperBagPrice;
        bill=bill+"Paperbag Added : " + paperBagPrice + "\n";
    }
    public void removePaperBag()
    {
        if(isPaperBagAdded!=true)
        {
            System.out.println("Sorry! You haven't added Paper Bag.");
        }
        else
        {
            totalPrice=totalPrice-paperBagPrice;
            bill=bill+"Paper Bag Removed : -" + paperBagPrice + "\n";
        }
    }
    public int totalBill()
    {
        return totalPrice;
    }
    public String getBill()
    {
        bill=bill+"Total Price : " + totalPrice + "\n";
        return bill;
    }
}
