package PizzaProject;

public class DeluxePizza extends Pizza{

    DeluxePizza(boolean isVeg)
    {
        super(isVeg);
        this.addExtraCheese();
        this.addExtraToppings();
    }
}
