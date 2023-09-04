package PizzaProject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int FinalBill=0;
        System.out.println("\n\n\t\t<-WELCOME->");
        System.out.println("Which Pizza You Want?(Regular=1/Deluxe=2)");
        int pizzaAns=in.nextInt();
        if(pizzaAns==1)
        {
            
            System.out.println("How Many Pizza You Want?");
            int noOfPizza=in.nextInt();
            System.out.println("\n");
            int OrderNo=noOfPizza-noOfPizza+1;
            String tempBill="";
            while(noOfPizza!=0)
            {
                Pizza pizza=new Pizza(true);
                tempBill=tempBill+"\nItem-" + OrderNo;
                System.out.println("Order No. " + OrderNo);
                System.out.println("___________");
                System.out.println("Would you like VEG or NON-VEG(v/V or n/N)?");
                String ans=in.next();
                if(ans.equals("v") || ans.equals("V"))
                {
                    pizza=new Pizza(true);
                }
                else if(ans.equals("n") || ans.equals("N"))
                {
                    pizza=new Pizza(false);
                }
                else
                {
                    System.out.println("Sorry! Item Doesn't Exists");
                }
        
                System.out.println("Want An Extra Cheese?(y/Y)");
                String cheeseAns=in.next();
                if(cheeseAns.equals("y") || cheeseAns.equals("Y"))
                {
                    pizza.addExtraCheese();
                }
        
                System.out.println("Want Extra Toppings?(y/Y)");
                String toppingsAns=in.next();
                if(toppingsAns.equals("y") || toppingsAns.equals("Y"))
                {
                    pizza.addExtraToppings();
                }
        
                System.out.println("Want A Paper Bag?(y/Y)");
                String paperBagAns=in.next();
                if(paperBagAns.equals("y") || paperBagAns.equals("Y"))
                {
                    pizza.addPaperBag();
                }
        
                System.out.println("Total Price : " + pizza.totalBill() + "\n\n");
            
                System.out.println("Want To Remove Anything?(Cheese=1/Toppings=2/Paper Bag=3/No=0)");
                {
                    int removeAns=in.nextInt();
                    if(removeAns==1)
                    {
                        pizza.removeExtraCheese();
                    }
                    else if(removeAns==2)
                    {
                        pizza.removeExtraToppings();
                    }
                    else if(removeAns==3)
                    {
                        pizza.removePaperBag();
                    }
                }
                System.out.println();
    
                tempBill=tempBill + "\n" +pizza.getBill();
                FinalBill=FinalBill+pizza.totalBill();
                noOfPizza=noOfPizza-1;
                OrderNo++;
            }
            System.out.println("Generate The Bill?(y/Y)");
            String billAns=in.next();
            if(billAns.equals("y") || billAns.equals("Y"))
            {
                System.out.println("\n******************************\n\t  <-BILL->");
                System.out.println(tempBill);
            }
            System.out.println("_______________________________");
            System.out.println("Total Amount To Be Paid : " + FinalBill + "\n");
            System.out.println("******************************");
            System.out.println("  ThankYou! Have A Nice Day.\n\n");
        }
        else if(pizzaAns==2)
        {
            
            String tempBill="";
            System.out.println("How Many Pizza You Want?");
            int noOfPizza=in.nextInt();
            System.out.println("\n");
            int OrderNo=noOfPizza-noOfPizza+1;
            while(noOfPizza!=0)
            {
                DeluxePizza dPizza=new DeluxePizza(true);
                System.out.println("Would you like VEG or NON-VEG(v/V or n/N)?");
                String dPizzaAns=in.next();
                if(dPizzaAns.equals("v") || dPizzaAns.equals("V"))
                {
                    dPizza=new DeluxePizza(true);
                }
                else if(dPizzaAns.equals("n") || dPizzaAns.equals("N"))
                {
                    dPizza=new DeluxePizza(false);
                }
                else
                {
                    System.out.println("Sorry! Item Doesn't Exists");
                }
                tempBill=tempBill + "\nItem-" + OrderNo + "\n";
                FinalBill=FinalBill+dPizza.totalBill();
                noOfPizza=noOfPizza-1;
                OrderNo++;
                tempBill=tempBill+dPizza.getBill();
            }
            System.out.println("Generate The Bill?(y/Y)");
            String billAns=in.next();
            if(billAns.equals("y") || billAns.equals("Y"))
            {
                System.out.println("\n******************************\n\t  <-BILL->");
                System.out.println(tempBill);
            }
            System.out.println("______________________________");
            System.out.println("Total Amount To Be Paid : " + FinalBill + "\n");
            System.out.println("******************************");
            System.out.println("  ThankYou! Have A Nice Day.\n\n");
        }
        else
        {
            System.out.println("Sorry! Please Choose Valid Input\n");
        }
    }    
}
